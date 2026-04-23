package notebooklm;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String configPath = args.length > 0 ? args[0] : "config/notebooklm.properties";

        try {
            NotebookLMConnector connector = new NotebookLMConnector(configPath);

            System.out.println("Probando conexión con NotebookLM Enterprise...");
            if (!connector.testConnection()) {
                System.err.println("No se pudo conectar. Verificá el token y el número de proyecto en: " + configPath);
                System.exit(1);
            }
            System.out.println("Conexión exitosa.\n");

            System.out.println("Notebooks recientes:");
            System.out.println(connector.listRecentNotebooks());

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
