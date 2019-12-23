package lab.subject;

import lab.activity.*;

public class Coast extends Subject {
    private String name = "берег ";


    public Coast(Drag drag, Limited limited, Covered covered) {
        addActivity(drag);
        addActivity(limited);
        addActivity(covered);
    }

}
