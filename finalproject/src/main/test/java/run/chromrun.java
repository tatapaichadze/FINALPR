package run;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class chromrun {

    @BeforeTest
    public void setup() {
        Selenide.open("https://technoboom.ge");
        Configuration.browserSize = "1920x1088";

    }
}

