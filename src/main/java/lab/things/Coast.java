package lab.things;

import lab.activity.*;

import java.util.ArrayList;
import java.util.List;

public class Coast implements Thing {
    private String name;
    {
        name = " берег ";
    }

    public class Description implements Describing{
        private String characteristic = "Узкий пологий ";

        @Override
        public String getDescribe() {
            return characteristic;
        }
    }

    private List<Activity> activities;

    public Coast() {
        activities = new ArrayList<Activity>();
        activities.add(new Drag());
        activities.add(new Limited());
        activities.add(new Covered());
    }

    public String doActivity(String activityName, Thing thing) {
        if (Activity.getActivityName().equals(activityName)) {
            return activity.execute();
        }
        for (Activity activity : activities)
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {

    }
}
