package june22_parameters;
import java.io.FileOutputStream;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.testng.annotations.Test;

public class Create_Jxl {
@Test
public void Create() throws IOException, RowsExceededException, WriteException{
	FileOutputStream fo=new FileOutputStream("d://mrng.xls");
	WritableWorkbook wb=Workbook.createWorkbook(fo);
	WritableSheet ws=wb.createSheet("Results", 1);
	Label un=new Label(0,0,"Username");
	Label pw=new Label(1,0,"password");
	Label rs=new Label(2,0,"Output");
	ws.addCell(un);
	ws.addCell(pw);
	ws.addCell(rs);
	wb.write();
	wb.close();
}
}
