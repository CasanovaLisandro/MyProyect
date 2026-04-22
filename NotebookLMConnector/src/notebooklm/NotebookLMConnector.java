package notebooklm;

import java.io.IOException;

public class NotebookLMConnector {

    private final NotebookLMConfig config;
    private final NotebookLMClient client;

    public NotebookLMConnector(String configPath) throws IOException {
        this.config = new NotebookLMConfig(configPath);
        this.client = new NotebookLMClient(config.getAccessToken(), config.getBaseUrl());
    }

    /** Returns true if the service responds successfully. */
    public boolean testConnection() {
        try {
            client.get("/api/v1/notebooks");
            return true;
        } catch (IOException e) {
            System.err.println("Connection test failed: " + e.getMessage());
            return false;
        }
    }

    /** Lists all notebooks for the authenticated user. */
    public String listNotebooks() throws IOException {
        return client.get("/api/v1/notebooks");
    }

    /** Creates a new notebook with the given title. */
    public String createNotebook(String title) throws IOException {
        String body = "{\"title\":\"" + escapeJson(title) + "\"}";
        return client.post("/api/v1/notebooks", body);
    }

    /** Deletes a notebook by ID. */
    public String deleteNotebook(String notebookId) throws IOException {
        return client.delete("/api/v1/notebooks/" + notebookId);
    }

    /** Adds a source URL to an existing notebook. */
    public String addSource(String notebookId, String sourceUrl) throws IOException {
        String body = "{\"source_url\":\"" + escapeJson(sourceUrl) + "\"}";
        return client.post("/api/v1/notebooks/" + notebookId + "/sources", body);
    }

    /** Queries a notebook with a natural-language question. */
    public String query(String notebookId, String question) throws IOException {
        String body = "{\"question\":\"" + escapeJson(question) + "\"}";
        return client.post("/api/v1/notebooks/" + notebookId + "/query", body);
    }

    private static String escapeJson(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
