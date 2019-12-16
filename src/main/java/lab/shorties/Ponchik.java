package lab.shorties;

import java.util.List;

import lab.activity.*;

public class Ponchik extends Shorty {
    private List activities;

    public Ponchik(String name) {
        super(name);
        addActivity(new Pound());
        addActivity(new Fill());
        addActivity(new PutOn());
        addActivity(new See());
        addActivity(new Parashute());
        addActivity(new Go());
        addActivity(new Part());
        addActivity(new Check());
        addActivity(new Lick());
        addActivity(new Ensure());
        addActivity(new Chose());
        addActivity(new Put());
        addActivity(new Start());
        addActivity(new End());
    }


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (!(object instanceof Ponchik)) {
            return false;
        }

//        if (this.name.equals(((Ponchik) object).name)) {
//            return true;
//        }

        return false;
    }

}
