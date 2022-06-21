package Technoboom;

import Stepobject.Registrationstep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import run.chromrun;

import static Dataobject.Registrationdata.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class technoregist extends chromrun {

    @Test

    public void registr() {
        Registrationstep steps = new Registrationstep();
        Step
                .GotoRegpage()
                .FirstName(firstName)
                .Lastnamereg(lastname)
                .Phonereg(phone)
                .Emailreg(email)
                .Addrs(addres)
                .Passw(password)
                .retry(password)
                .Chek();




    /*  byText("რეგისტრაცია").click();
    $(byText("დახურვა")).click();
    $(byText("სწრაფი რეგისტრაცი")).shouldBe(Condition.visible);
    Assert.assertTrue($(byText("სწრაფი რეგისტრაცი")).is(Condition.visible));


    $("#firstName").setValue("ტატა");
    $("#firstName").shouldBe(Condition.empty);

    $("#lastname").click();
    $("#lastname").setValue("პაიჭაძე");
    $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
    Assert.assertTrue($(byText("გვარი სავალდებულოა")).is(Condition.visible));

    String sstr = "პაიჭაძე";
    Assert.assertEquals("გვარი სავალდებულოა", sstr, $("#lastname").getText());
    $("#email").click();
    $("#email").setValue("tatiana.paichadze.1@iliauni.edu.ge");
    $("#email").shouldBe(Condition.empty);
    $("#password").click();
    $("#password").setValue("Tata1234567890.");
    $("#confir#Password").setValue("Tata1234567890.");
        Assert.assertEquals( "#password", "#confir#Password");

    $("#singup").shouldBe(Condition.enabled);

        }  */
    }

}

