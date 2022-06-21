package Technoboom;

import Stepobject.negaivstep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import run.chromrun;

import static Dataobject.negativregdate.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Step.*;

public class neggativ extends chromrun {

    @Test

    public void negativreg (){
        negaivstep steps= new negaivstep();

        Step
            .goTopage()
            .Emailreg(email)
            .Passw(password)
            .tryin(confirmpassword)
            .ChekIN();







     /*   byText("რეგისტრაცია").click();
        $(byText("დახურვა")).click();
        $("#email").click();
        $("#email").setValue("tatiana.paichadz");
        $("#email").shouldBe(Condition.empty);
        $("#password").click();
        $("#password").setValue("Tata1234567890.");
        $("#confir#Password").setValue("Tata123");
        Assert.assertEquals( "#password", "#confir#Password");

        $("#singup").shouldBe(Condition.enabled);*/

    }
}