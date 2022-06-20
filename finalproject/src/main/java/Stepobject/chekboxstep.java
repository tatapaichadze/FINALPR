package Stepobject;

import PageObject.chekboxpage;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class chekboxstep extends chekboxpage {



    public chekboxstep shopcard(){
        cklikbox.click();
        return this;

    }

    public chekboxstep Emptybox(){
        empty.shouldBe(Condition.visible);
        return this;
    }

    public chekboxstep Found() {
        foundbox.click();
        return this;
    }

    public  chekboxstep  Foundthing(String thing){
        foundbox.setValue(thing);
        return this;
    }
    public  chekboxstep addC(){
        addcart.click();
        return this;

    }

    public chekboxstep EMPT(){
        empty.click();
        return this;

    }
    public chekboxstep DeLeTe(){
       deletetext.click();
       return this;


    }
    public chekboxstep Chekthis(){
        empty.shouldBe(Condition.visible);
        return this;
    }




}
