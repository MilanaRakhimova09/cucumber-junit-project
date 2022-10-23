package com.cydeo.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
//This class is only 1 time we are creating in utilities package
//you will just call getProperty method with


public class ConfigurationReader {


      // 1- Create the object of Properties class
      // We need properties class to use methods coming from class like load(), getProperty("key")
      //It is private because I WILL BE USING ONLY IN THIS CLASS

       private static Properties properties = new Properties();
        // we want to open the properties file and load to properties object ONLY ONCE BEFORE READING
        //having static block because static runs first
        static{
        try {
            // 2- Create the object of FileInputStream
            // We need this object to open file as a stream in Java memory
            FileInputStream file = new FileInputStream("configuration.properties");


            // 3 - Load the properties object using FileInputStream object
            // Load "properties" object with the "file" we opened using FileInputStream

            properties.load(file);
        // if we do not close the file,it will take space from computer memory like Scanner
        file.close();
        } catch (IOException e ) {
            e.printStackTrace();
        }
        }

    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in configuration.properties file
     * @return --> value for the key. returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env"))
     */



    public static String getProperty(String keyword){
        return properties.getProperty(keyword);

   }

}
