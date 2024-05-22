package org.example.utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

public class ReadPropertiesFile {

    public static Properties readConfiguration(){

        Properties prop = null;

        if(prop == null){
            prop = new Properties();

            try{
                FileReader reader = new FileReader("src/main/resources/Application.properties");
                prop.load(reader);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return prop;
    }
}
