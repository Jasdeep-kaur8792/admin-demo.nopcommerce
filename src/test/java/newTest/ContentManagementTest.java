package newTest;

import baseTestNew.Baseclass;
import org.testng.annotations.Test;

import java.io.IOException;

public class ContentManagementTest extends Baseclass {
    @Test

    public void contentTest() throws InterruptedException, IOException
    {
        pageFactoryNew.getLoginPage().newLogIn();
        pageFactoryNew.getContentManagement().contentManagement();
        pageFactoryNew.getLoginPage().newLogOut();
    }


}
