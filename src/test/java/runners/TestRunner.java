package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        //practice website
        features = "src/test/resources/features/Practice/login.feature",         //accept either class or package
        glue = "stepdefinations/Practice",  //just accept the package
        plugin={
                "pretty",
                "html:test-output",
                "json:json_output/cucumber.json",
                "junit:junit_xml_output/cucumber.xml"},    //generate different type of reporting
        dryRun = false,    //to check the mapping  between stepdefination file and features file(by default is false) if you set to true,testcase wont be run,just check it
        monochrome = true,  //display the console output is a proper readable format
//        tags="@login"
//        tags="@login_with_valid"
//        tags="@login_with_invalid"
        tags="@login_with_Data_table"
//        tags="@login_with_Data_table_with_header"
//        tags = "@login_with_valid or @login_with_invalid"



)

public class TestRunner extends  AbstractTestNGCucumberTests {


}
