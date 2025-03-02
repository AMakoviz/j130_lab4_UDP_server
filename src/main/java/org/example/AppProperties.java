package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppProperties {
    private Properties properties;

    public AppProperties() {
        File filePropeties = new File("application.properties");
        properties = new Properties();
        try {
            properties.load(new FileInputStream(filePropeties));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public int getPort(){
        if(properties != null){
            return Integer.parseInt(properties.getProperty("port"));
        }else {
            throw new NullPointerException();
        }
    }
}
