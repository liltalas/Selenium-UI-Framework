package utilities;

import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

    /*
    The advantage of using properties file is we can configure things which are prone to change over
    a period of time without the need of changing anything in code.
     */
    public static Properties properties;

    public static void initializeProperties(){
        try {
            // Here we are creating an object of FileReader and passing the path to it.
            // FileReader is a class in java which is used to read info from files
            // It throws an exception which is why we have it surrounded in a try catch block
            FileReader fileReader = new FileReader("src/test/resources/config.properties");
            // initializing our Properties object
            properties = new Properties();
            // using the .load(fileReader) method in order to pass the file reader to the properties object
            properties.load(fileReader);
        } catch(Exception e){
            // printing the exception stack trace if there's one caught
            e.printStackTrace();
        }
    }

    public static String getConfigProperty(String key){

        // returning the value stored inside of the key passed as an argument to this method
        return properties.getProperty(key);
    }
}
