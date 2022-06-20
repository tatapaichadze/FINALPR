package Stepobject;

import PageObject.negativpage;
import org.w3c.dom.html.HTMLInputElement;

public class negaivstep extends negativpage {

    public negaivstep goTopage() {
        Registration.click();
        return this;



    }
    public negaivstep Emailreg (String Email) {
        Emailin.setValue(Email);
        return this;

    }

    public negaivstep  Passw (String  Pass) {
        Passwordin.setValue(Pass);
        return this;

    }

    public  negaivstep tryin (String retrypassw){
        Retrypasswordin.setValue(retrypassw);
        return this;


    }
    public negaivstep ChekIN() {
        chekb.click();
        return this;

    }


}
