package june_28;
import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateWorkBook
{
public static void main(String[] args)throws Exception
{
//Create Blank workbook
HSSFWorkbook hs=new HSSFWorkbook();
//Create file system using specific name
FileOutputStream out = new FileOutputStream (new File("e://createworkbook1.xls"));
//write operation workbook using file out object
hs.write(out);
out.close();
System .out.println("createworkbook.xlsx written successfully");
}
}