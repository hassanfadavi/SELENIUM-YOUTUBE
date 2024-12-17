package tests.TestautSite.ReadFromExcell;

import org.testng.annotations.*;

import java.io.IOException;

public class DataProviders {

//


     @DataProvider(name="inputData")
    public String[][] getData() throws IOException {



         String path = "C:\\Users\\hassan\\Desktop\\SDET\\test1.xlsx";

         System.out.println(path);



         ExcelUtility elutil=new ExcelUtility(path);
        int totalrows=elutil.getRowCount("Sheet1");
       int totalcols=elutil.getCellCount("Sheet1",1);
       String loginData[][]=new String[totalrows][totalcols];

       for(int i=1;i<=totalrows;i++){
           for(int j=0;j<totalcols;j++){
               loginData[i - 1][j] = elutil.getCellData("Sheet1",i,j);
                System.out.println("Row " + i + ", Col " + j + ": " + loginData[i - 1][j]);
           }
       }


       return loginData;


     }




}
