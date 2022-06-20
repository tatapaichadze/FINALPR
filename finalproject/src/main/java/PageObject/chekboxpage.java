package PageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class chekboxpage {

    public SelenideElement

    cklikbox=$("fa-shopping-cart"),
    deletetext=$(byText("fa-trash-alt")),
    foundbox=$("#fas fa-search"),
    empty= $(byText("კალათა ცარიელია")),
    addcart=$(".კალათაში დამატება", 0);
}
