package class22;

public class FileTester {
    public static void main(String[] args) {
/*        JavaFile java1=new JavaFile("Cars",200);
        WordFile word1=new WordFile("Houses",300);
        PdfFile pdf1=new PdfFile("Resume",110);*/

        File[] files={new JavaFile("Cat",290),new PdfFile("Dogs",399),new WordFile("Horses",238)};
       // File[] files={java1,word1,pdf1};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }
}
