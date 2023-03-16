package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyManager {

    public String url, validEmail, validPassword, invalidEmail, invalidPassword;

    public static PropertyManager instance;

    public static PropertyManager getInstance() {
        if (instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;}


        public void loadData () {
            Properties properties = new Properties();
            try {
                FileInputStream fi = new FileInputStream("src/main/resources/configuration.properties");
                properties.load(fi);
            } catch (Exception e) {
                e.printStackTrace();
            }
            url = properties.getProperty("url");
            validEmail = properties.getProperty("validEmail");
            validPassword = properties.getProperty("validPassword");
            invalidEmail = properties.getProperty("invalidEmail");
            invalidPassword = properties.getProperty("invalidPassword");
        }

        public String getUrl () {
            return url;
        }
        public String getValidEmail () {
            return validEmail;
        }
        public String getValidPassword () {
            return validPassword;
        }
        public String getInvalidEmail () {
            return invalidEmail;
        }
        public String getInvalidPassword () {
            return invalidPassword;
        }

    }

