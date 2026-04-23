package notebooklm;

import java.io.IOException;

public class NotebookLMConnector {

    private final NotebookLMConfig config;
    private final NotebookLMClient client;

    public NotebookLMConnector(String configPath) throws IOException {
        this.config = new NotebookLMConfig(configPath);
        this.client = new NotebookLMClient(config.getAccessToken(), config.buildBaseUrl());
    }

    /** Verifica que la API responde correctamente. */
    public boolean testConnection() {
        try {
            client.get("/notebooks:listRecentlyViewed");
            return true;
        } catch (IOException e) {
            System.err.println("Fallo en la conexión: " + e.getMessage());
            return false;
        }
    }

    /** Lista los notebooks vistos recientemente (hasta 500). */
    public String listRecentNotebooks() throws IOException {
        return client.get("/notebooks:listRecentlyViewed");
    }

    /** Crea un notebook con el título indicado. Devuelve el JSON con notebookId y name. */
    public String createNotebook(String title) throws IOException {
        String body = "{\"title\":\"" + escapeJson(title) + "\"}";
        return client.post("/notebooks", body);
    }

    /** Recupera un notebook por su ID. */
    public String getNotebook(String notebookId) throws IOException {
        return client.get("/notebooks/" + notebookId);
    }

    /**
     * Borra uno o más notebooks por su nombre completo de recurso.
     * Formato del nombre: projects/PROJECT_NUMBER/locations/LOCATION/notebooks/NOTEBOOK_ID
     */
    public String deleteNotebooks(String... notebookNames) throws IOException {
        StringBuilder names = new StringBuilder();
        for (int i = 0; i < notebookNames.length; i++) {
            if (i > 0) names.append(',');
            names.append("\"").append(escapeJson(notebookNames[i])).append("\"");
        }
        return client.post("/notebooks:batchDelete", "{\"names\":[" + names + "]}");
    }

    /**
     * Comparte un notebook con un usuario.
     * role: PROJECT_ROLE_OWNER | PROJECT_ROLE_WRITER | PROJECT_ROLE_READER | PROJECT_ROLE_NOT_SHARED
     */
    public String shareNotebook(String notebookId, String email, String role) throws IOException {
        String body = "{\"accountAndRoles\":[{\"email\":\""
                + escapeJson(email) + "\",\"role\":\"" + escapeJson(role) + "\"}]}";
        return client.post("/notebooks/" + notebookId + ":share", body);
    }

    private static String escapeJson(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
