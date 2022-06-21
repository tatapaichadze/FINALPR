package Technoboom;

import Stepobject.Registrationstep;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import run.chromrun;

import static Dataobject.Chekboxdate.thing;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class chekbox extends chromrun {

    @Test
    public void chekcard() {

        Registrationstep steps= new Registrationstep();
          Step
                  .cklikbox()
                  .empty()
                  .foundbox()
                  .foundboxthing(thing)
                  .empty()
                  .deletetext()
                  .empty





       /* $(".fa-shopping-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#fas fa-search").click();
        $("#fas fa-search").setValue("მაცივარი").pressEnter();
        $(".კალათაში დამატება", 0).click();
        $("fa-shopping-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.disabled);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible); */




        }
    }
