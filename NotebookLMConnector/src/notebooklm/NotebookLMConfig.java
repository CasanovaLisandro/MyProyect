package notebooklm;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class NotebookLMConfig {

    private final Properties properties;

    public NotebookLMConfig(String configPath) throws IOException {
        properties = new Properties();
        try (FileInputStream fis = new FileInputStream(configPath)) {
            properties.load(fis);
        }
    }

    public String getAccessToken() {
        return properties.getProperty("google.access.token");
    }

    public String getProjectNumber() {
        return properties.getProperty("google.project.number");
    }

    /** us | eu | global  (prefijo del subdominio del endpoint) */
    public String getEndpointLocation() {
        return properties.getProperty("google.endpoint.location", "us");
    }

    /** Ubicación geográfica del almacén de datos: global | us | eu */
    public String getLocation() {
        return properties.getProperty("google.location", "global");
    }

    /**
     * Construye la URL base real de la Discovery Engine API:
     * https://ENDPOINT_LOCATION-discoveryengine.googleapis.com/v1alpha/projects/PROJECT_NUMBER/locations/LOCATION
     */
    public String buildBaseUrl() {
        return "https://" + getEndpointLocation()
                + "-discoveryengine.googleapis.com/v1alpha/projects/"
                + getProjectNumber()
                + "/locations/" + getLocation();
    }
}
