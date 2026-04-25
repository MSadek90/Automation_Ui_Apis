package org.example.utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {


    public static String readValueFromConfigFile(String filepath, String key){
        Properties properties = new Properties();
        try{
        FileInputStream fileInputStream = new FileInputStream(filepath);
        properties.load(fileInputStream);
        fileInputStream.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("This file not existed: " + filepath); 
        }
        return properties.getProperty(key);
    }
}
