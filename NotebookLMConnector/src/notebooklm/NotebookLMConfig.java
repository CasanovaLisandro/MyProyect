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

    public String getClientId() {
        return properties.getProperty("google.client.id");
    }

    public String getClientSecret() {
        return properties.getProperty("google.client.secret");
    }

    public String getAccessToken() {
        return properties.getProperty("google.access.token");
    }

    public String getRefreshToken() {
        return properties.getProperty("google.refresh.token");
    }

    public String getBaseUrl() {
        return properties.getProperty("notebooklm.base.url", "https://notebooklm.google.com");
    }
}
