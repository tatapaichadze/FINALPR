package Stepobject;


import PageObject.Registrationpage;

import static Dataobject.Registrationdata.password;

public class Registrationstep extends Registrationpage {


    public Registrationstep GotoRegpage() {
        Registrationbaton.click();
        return this;


    }


    public Registrationstep FirstName(String username) {
        Usernameinput.setValue(username);
        return this;


    }

    public Registrationstep Lastnamereg (String lastname) {
        Lastnameinput.setValue(lastname);
        return this;

    }

    public Registrationstep Phonereg (String Phone) {
        phoneinput.setValue(Phone);
        return this;

    }
    public Registrationstep Emailreg (String Email) {
        Emailinput.setValue(Email);
        return this;
    }

        public Registrationstep Addrs (String Adres) {
            Adressinput.setValue(Adres);
            return this;
        }

        public Registrationstep Passw (String  Pass) {
            Passwordinput.setValue(Pass);
            return this;

        }

         public  Registrationstep retry(String retrypassw){
        Retrypasswordinput.setValue(retrypassw);
        return this;


    }
    public Registrationstep Chek() {
        chekbox.click();
        return this;

    }



}
