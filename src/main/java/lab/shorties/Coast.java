package lab.shorties;

import lab.activity.*;
import lab.things.Describing;
import lab.things.Thing;

import java.util.ArrayList;
import java.util.List;

public class Coast extends Subject {
    private String name = "берег ";


//    public class Description implements Describing {
//        private String characteristic = "Узкий пологий ";
//
//        @Override
//        public String getDescribe() {
//            return characteristic;
//        }
//    }

    public Coast() {
        addActivity(new Drag());
        addActivity(new Limited());
        addActivity(new Covered());
    }
}
