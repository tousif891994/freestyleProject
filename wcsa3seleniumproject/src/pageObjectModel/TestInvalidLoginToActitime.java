package pageObjectModel;

import java.io.IOException;

public class TestInvalidLoginToActitime extends BaseTest{
	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		int rc = flib.getRowCount(EXCEL_PATH, "invaliddata");
		
		for (int i = 1; i <=rc; i++)
		{
			String invalidUsername = flib.ReadExcelData(EXCEL_PATH, "invaliddata", i, 0);
			String invalidPassword = flib.ReadExcelData(EXCEL_PATH, "invaliddata", i, 1);
			
			lp.invalidLoginActitime(invalidUsername, invalidPassword);
		}
		
		bt.tearDown();
		
	}

}
