package class22;

public class WordFile extends File{
    WordFile(String name, int size){
        super(name, size);
        System.out.println("File Name: "+name+" Size: "+size);
    }

    void open(){
        System.out.println("Opening file in Microsoft Word");
    }

/*    @Override
    void edit(){

    }
    @Override
    void close(){

    }*/
}
