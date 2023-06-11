package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E12Excel {
    public static void main(String[] args) {
        String path=System.getProperty("Users")+"\\adaml\\IdeaProjects\\SDETJavaBatch16\\Files\\Employees.xlsx";

        try{
            FileInputStream fileInputStream=new FileInputStream(path);
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet=xssfWorkbook.getSheet("Sheet1");
            Row row=sheet.getRow(0);
            System.out.println(row.getCell(0));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
