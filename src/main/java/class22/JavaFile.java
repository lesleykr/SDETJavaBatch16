package class22;

public class JavaFile extends File{
   JavaFile(String name, int size){
        super(name, size);
        System.out.println("File Name: "+name+" Size: "+size);
    }

    void open(){
        System.out.println("Opening file in IntelliJ");
    }


    @Override
    void close(){
        System.out.println("Closing IntelliJ");
    }
}
