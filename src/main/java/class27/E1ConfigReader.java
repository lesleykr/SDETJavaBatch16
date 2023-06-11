package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {


    //String path="C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch16\\Files\\Config.properties";
    String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.get("userName"));
    // System.out.println(System.getProperty("user.dir"));
     //  System.out.println(path1);
    //String myPath="C:\\Users\\adaml\\IdeaProjects\\SDETJavaBatch16\\Files\\Config.properties";
    }
}
