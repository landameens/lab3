package lab.subject;

import lab.activity.Come;
import lab.activity.Party;

public class Dives extends Subject {

    public Dives(String name, Come come, Party party) {
        super(name);
        addActivity(come);
        addActivity(party);
    }

}
