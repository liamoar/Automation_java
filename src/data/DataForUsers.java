package data;


import org.testng.annotations.DataProvider;

public class DataForUsers {

    @DataProvider(name = "UserData")
    public static Object[][] signInData() throws Exception {
        String xlFilePath = "src/excel/signinForm.xlsx";
        String sheetName =  "sheet1";
        Object[][] mydata = testData(xlFilePath,sheetName);
        return mydata;

    }

    private static Object[][] testData(String xlFilePath, String sheetName) throws Exception {
        ExcelFileParser excelParserObj = new ExcelFileParser(xlFilePath);
        //ExcelFileParser  = new ExcelFileParser(xlFilePath);
        Object[][] excelData = null;
        int rows = excelParserObj.getRowCount(sheetName);
        System.out.println("The total rows in the given sheet: "+rows);
        int columns = excelParserObj.getColumnCount(sheetName);
        System.out.println("The total columns in the given sheet: "+columns);
        excelData = new Object[rows-1][columns];

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                excelData[i - 1][j] = excelParserObj.getCellData(sheetName, j, i);
            }
        }
        return excelData;


    }

}
