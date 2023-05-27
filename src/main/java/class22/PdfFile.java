package class22;

public class PdfFile extends File{
    PdfFile(String name, int size){
      super(name, size);
        System.out.println("File Name: "+name+" Size: "+size);
    }

    void open(){
        System.out.println("Opening file in Adobe Reader");
    }

  /*  @Override
    void edit(){

    }
    @Override
    void close(){

    }*/
}
