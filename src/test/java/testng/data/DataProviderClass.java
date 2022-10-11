package testng.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

    // This method takes data as input parameters. The attribute dataprovider is mapped to "getData"
    @Test(dataProvider = "getData1")
    // Number of columns should match the number of input parameters
    public void loginTest(String Uid, String Pwd) {
        System.out.println("UserName is " + Uid);
        System.out.println("Password is " + Pwd);
    }

    //If the name is not supplied, the data provider’s name automatically defaults to the method’s name.
//A data provider returns an array of objects.
    @DataProvider(name = "getData1")
    public Object[][] getData() {
//Object [][] data = new Object [rowCount][colCount];
        Object[][] data = new Object[2][2];
        data[0][0] = "FirstUid";
        data[0][1] = "FirstPWD";
        data[1][0] = "SecondUid";
        data[1][1] = "SecondPWD";

        return data;
    }
}