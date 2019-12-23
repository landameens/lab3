package lab.subject;

import lab.activity.*;

public class Ponchik extends Subject {

    public Ponchik(String name, Pound pound, Fill fill, PutOn putOn, See see,
                   Parashute parashute, Go go, Part part, Check check, Lick lick,
                   Ensure ensure, Chose chose, Put put, Start start, End end) {
        super(name);
        addActivity(pound);
        addActivity(fill);
        addActivity(putOn);
        addActivity(see);
        addActivity(parashute);
        addActivity(go);
        addActivity(part);
        addActivity(check);
        addActivity(lick);
        addActivity(ensure);
        addActivity(chose);
        addActivity(put);
        addActivity(start);
        addActivity(end);
    }


    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (this == object) {
            return true;
        }

        if (!(object instanceof Ponchik)) {
            return false;
        }

//        if (this.name.equals(((Ponchik) object).name)) {
//            return true;
//        }

        return false;
    }

}
