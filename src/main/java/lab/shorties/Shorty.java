package lab.shorties;

import lab.activity.*;
import lab.things.Thing;

import java.util.List;

public abstract class Shorty {

    private String name;

    public Shorty(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    private List<Activity> activities;

    public String doActivity(String activityName, Thing thing) {
        for (Activity activity : activities) {
            if (activity.getName().equals(activityName)) {
                return activity.execute(thing);
            }

        }
        return null;
    }
}
