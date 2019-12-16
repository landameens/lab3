package lab.shorties;

import java.util.List;

import lab.activity.*;
import lab.things.Thing1;

import java.util.ArrayList;

public class Ponchik extends Shorty {
    private List activities;

    public Ponchik(String name) {
        super(name);
        activities = new ArrayList<>();
        activities.add(new Pound());
        activities.add(new Fill());
        activities.add(new PutOn());
        activities.add(new See());
        activities.add(new Parashute());
        activities.add(new Go());
        activities.add(new Part());
        activities.add(new Check());
        activities.add(new Lick());
        activities.add(new Ensure());
        activities.add(new Chose());
        activities.add(new Put());
        activities.add(new Start());
        activities.add(new End());
        //activities.add(new );
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

    @Override
    public String toString() {
        return "Ponchik [activities=" + activities + "]";
    }


}
