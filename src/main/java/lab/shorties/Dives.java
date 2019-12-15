package lab.shorties;

import java.util.ArrayList;
import java.util.List;

public class Dives extends Shorty {
    private List<Activity> activities;

    public Dives(String name) {
        super(name);
        activities = new ArrayList<>();
        activities.add(new Come());
        activities.add(new Party());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((activities == null) ? 0 : activities.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (obj instanceof Dives)
            return false;
        Dives other = (Dives) obj;
        if (activities == null) {
            if (other.activities != null)
                return false;
        } else if (!activities.equals(other.activities))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dives [activities=" + activities + "]";
    }


}
