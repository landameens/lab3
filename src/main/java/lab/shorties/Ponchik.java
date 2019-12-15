package lab.shorties;

import java.util.List;

import lab.activity.*;
import lab.things.Salt;
import lab.things.Thing;
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ponchik other = (Ponchik) obj;

        if (activities == null) {
            if (other.activities != null)
                return false;
        }
        else if (!activities.equals(other.activities))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Ponchik [activities=" + activities + "]";
    }


}
