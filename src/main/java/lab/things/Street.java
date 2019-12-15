package lab.things;

import java.util.ArrayList;
import java.util.List;

public class Street implements Thing {
    private String name = " улица ";

    public class Description implements Describing{
        private String characteristic1 = "Самая большая ";
        private String characteristic2 = " самая красивая ";

        @Override
        public String getDescribe() {
            return characteristic1+characteristic2;
        }
    }

    private List<Activity> activities;

    public Street() {
        activities = new ArrayList<Activity>();
        activities.add(new Drag());
    }

    public String doActivity(String activityName, Thing thing) {
        for (Activity activity : activities) {
            if (activity.getName().equals(activityName)) {
                return activity.execute(thing);
            }
        }
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
