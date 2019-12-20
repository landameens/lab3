package lab.subject;

import lab.activity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Subject{

    private String name;
    private List<Activity> activities = new ArrayList<>();

    public Subject(String name) {
        this.name=name;
    }

    public Subject(){

    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public String doActivity(String activityName) {
        for (Activity activity : activities) {
            if (activity.getActivityName().equals(activityName)) {
                return activity.execute();
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (!(object instanceof Subject)) {
            return false;
        }

        if (this.name.equals(((Subject) object).name)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
