package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Registrationpage {


    public SelenideElement

            Registrationbaton =$(byText("რეგისტრაცია")),
            Usernameinput =$("#firstName"),
            Lastnameinput= $("#lastname"),
            phoneinput =$("#phone"),
            Emailinput=$("#email"),
            Adressinput=$("address"),
            Passwordinput=$("password"),
            Retrypasswordinput=$("password_confirm"),
            chekbox=$("c-checkbox__checkmark mr-2"),
            Reg=$(byText("გვარი სავალდებულოა"));


}
