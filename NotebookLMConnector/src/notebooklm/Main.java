package notebooklm;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String configPath = args.length > 0 ? args[0] : "config/notebooklm.properties";

        try {
            NotebookLMConnector connector = new NotebookLMConnector(configPath);

            System.out.println("Probando conexión con NotebookLM...");
            if (!connector.testConnection()) {
                System.err.println("Error: no se pudo conectar. Verificá las credenciales en " + configPath);
                System.exit(1);
            }
            System.out.println("Conexión exitosa.");

            System.out.println("\nNotebooks disponibles:");
            System.out.println(connector.listNotebooks());

        } catch (IOException e) {
            System.err.println("Error de configuración: " + e.getMessage());
            System.exit(1);
        }
    }
}
