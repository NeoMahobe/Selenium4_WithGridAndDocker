package way2automation;

import com.way2automation.qa.base.TestBase;
import com.way2automation.qa.pages.WebTablesPage;
import com.way2automation.qa.utilities.TestUtil;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class AddUser extends TestBase {

    private WebDriver driver;
    private WebTablesPage webTablesPage;
    private TestUtil testUtil = null;

    @BeforeMethod
    @Parameters({"environment","browser"})
    public void setUp(@Optional String env,@Optional String browser) throws Exception {
        Initialization(env,browser);
    }

    @Test
    public void AddMultipleUsers() throws Exception {

        driver = GetWebDriver();
        testUtil = new TestUtil();
        webTablesPage = new WebTablesPage(driver);

        webTablesPage
                .NavigateToWebTables()
                .ClickAddUserButton()
                .CaptureMultipleUserDetails(2)
                .ClickCloseButton();
                //.VerifyEntriesInTable(2,"UserName");
    }

    @AfterMethod
    public void closeDown(ITestResult result) throws Exception {
        if (result.getStatus() == ITestResult.FAILURE) {
            testUtil.TakeScreenShotEndOfTest(result.getName().trim(), driver);
        }
        driver.quit();
    }
}
