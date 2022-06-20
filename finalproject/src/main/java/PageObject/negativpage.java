package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class negativpage {

    public SelenideElement


            Registration =$(byText("რეგისტრაცია")),
            Emailin=$("#email"),
            Passwordin=$("password"),
            Retrypasswordin=$("password_confirm"),
            chekb=$("c-checkbox__checkmark mr-2");

}
