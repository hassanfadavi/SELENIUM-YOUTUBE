import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class test1 {


    public WebDriver driver;

   @DataProvider(name="dp",indices = {0,2})
    public Object[][] loginData(){

        Object data[][]={    {"john@gmail.com","123"  },
                             {"john@gmail.com","john"  },
                             {"jamshid@gmail.com","BatA@E2zpkXYtg"  }
                                                         };
        return data;

   }




}
