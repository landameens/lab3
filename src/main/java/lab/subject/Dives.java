package lab.subject;

import lab.activity.Come;
import lab.activity.Party;

public class Dives extends Subject {

    public Dives(String name) {
        super(name);
        addActivity(new Come());
        addActivity(new Party());
    }

}
