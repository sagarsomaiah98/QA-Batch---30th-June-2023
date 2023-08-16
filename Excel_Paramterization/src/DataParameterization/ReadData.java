package DataParameterization;

public class ReadData {

	public static void main(String[] args) {
		Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA Batch - 30th June 2023\\Excel_Paramterization\\src\\TESTDATA\\TESTSUITE.xlsx");
		int rowCount=xls.getRowCount("GMAIL");
		
		//System.out.println(rowCount);
		
		String v1=xls.getCellData("GMAIL", "TESTCASE", 10);
		//System.out.println(v1);
		
		
		for(int i=1;i<=rowCount;i++) {
			
			String c1=xls.getCellData("GMAIL", "TCID", i);
			String c2=xls.getCellData("GMAIL", "TESTCASE", i);
			String c3=xls.getCellData("GMAIL", "STATUS", i);
			
			System.out.println(c1+" |"+c2+" | "+c3);
		}
		
	}

}
