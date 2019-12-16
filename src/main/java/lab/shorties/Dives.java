package lab.shorties;

import lab.activity.Come;
import lab.activity.Party;

import java.util.ArrayList;
import java.util.List;

public class Dives extends Subject {

    public Dives(String name) {
        super(name);
        addActivity(new Come());
        addActivity(new Party());
    }

}
