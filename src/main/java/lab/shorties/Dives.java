package lab.shorties;

import java.util.ArrayList;
import java.util.List;

public class Dives extends Shorty {

    public Dives(String name) {
        super(name);
        addActivity(new Come());
        addActivity(new Party());
    }

}
