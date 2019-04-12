package android.Pages;

import android.Framework.ExtentReportManager;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/**
 * Created by FatimaZahra on 31/01/2017.
 */

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SignInTest extends AbstractTest{

    @BeforeClass
    public static void beforeClass() {

        a = ExtentReportManager.GetExtent();
    }
    int var=1;
    @Test
    public void test_01() throws Exception {
        test = a.createTest("SignIn: test_01", "");

        Assert.assertTrue(var == 1, "test passe ");
    }
    @Test
    public void test_02() throws Exception {
        test = a.createTest("SignIn: test_01", "");

        Assert.assertTrue(var == 1, "test fail ");
    }


    @AfterMethod
    public void getResult(ITestResult result){

        if(result.getStatus() == ITestResult.FAILURE){

            test.log(Status.FAIL, "Test Case Failed is "+result.getName());
            test.log(Status.FAIL, "Test Case Failed is "+result.getThrowable());




        }else if(result.getStatus() == ITestResult.SUCCESS){
            test.log(Status.PASS, "Test Case success is "+result.getName());

        }else if(result.getStatus() == ITestResult.SKIP){
            test.log(Status.SKIP, "Test Case Skipped is "+result.getName());
        }
    }
    @AfterClass
    public static void tearDown(){


        a.flush();

    }


}
