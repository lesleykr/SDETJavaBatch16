package class22;

abstract public class File {
    /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open
    is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that
    will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc
    file we need Microsoft word to be installed etc.
     */
    String name;
    int size;
    File(String name, int size){
        this.name=name;
        this.size=size;
        System.out.println("File Name: "+name+" Size: "+size);
    }
    abstract void open();

    void edit(){
        System.out.println("file is being edited");

    }
    void close(){
        System.out.println("File now closed");
    }

}
