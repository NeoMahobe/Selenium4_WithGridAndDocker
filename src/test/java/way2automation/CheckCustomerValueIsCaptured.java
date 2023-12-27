package way2automation;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.WebTablesPage;
import com.way2automation.qa.utilities.TestUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class CheckCustomerValueIsCaptured extends TestBase {

    private WebDriver driver;
    private WebTablesPage webTablesPage;

    private TestUtil testUtil = null;

    @BeforeMethod
    @Parameters({"environment","browser"})
    public void setUp(@Optional String env,@Optional String browser) throws Exception {
        Initialization(env,browser);
    }

    /*This test was created to verify Customer value is displayed after user details are captured - the issue was picked up during testing.
     * The test will fail as the bug still persists
     *  */
    @Test
    public void BugTest_CheckCustomerValueIsCaptured() throws IOException {

        driver = GetWebDriver();
        testUtil = new TestUtil();
        webTablesPage = new WebTablesPage(driver);

        webTablesPage
                .NavigateToWebTables()
                .ClickAddUserButton()
                .CaptureUserDetails(1)
                .ClickSaveButton()
                .VerifyEntriesInTable(1,"Customer");
    }

    @AfterMethod
    public void closeDown(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.FAILURE) {
            testUtil.TakeScreenShotEndOfTest(result.getName().trim(), driver);
        }
        driver.quit();
    }
}
