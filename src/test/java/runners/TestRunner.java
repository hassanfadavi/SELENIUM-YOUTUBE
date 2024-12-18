package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
//
//        //Amazon
        features = "src/test/resources/features/Practice/login.feature",         //accept either class or package
        glue = "stepdefinations/Practice",  //just accept the package
        plugin={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},    //generate different type of reporting
        dryRun = false,    //to check the mapping  between stepdefination file and features file(by default is false) if you set to true,testcase wont be run,just check it
        monochrome = true    //display the console output is a proper readable format



//
//
////        navigateToGoogle
//          features = "src/test/resources/features/google",         //accept either class or package
//          glue = "stepdefinations/google",  //just accept the package
////          tags="@googleSignIn"
////           tags="@googleaboutPage"
//             tags="@googleEmail"
//
//        //navigateToGoogleaboutInPage
////        features = "src/test/resources/features/google/NavigateToGoogleAboutPage.feature",         //accept either class or package
////        glue = "stepdefinations/google/about"     //just accept the package
//
)
//
public class TestRunner extends  AbstractTestNGCucumberTests {


}
