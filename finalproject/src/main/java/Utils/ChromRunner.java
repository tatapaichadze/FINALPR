package Utils;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromRunner {

    import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

    public class ChromeRunner {
        @BeforeTest(description = "Configure browser before tests")
        public static void setUp() {
            Selenide.open("technoboom.ge");
        }
    }
}
