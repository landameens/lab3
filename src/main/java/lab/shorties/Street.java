package lab.shorties;

import lab.activity.Drag;
import lab.things.Describing;
import lab.things.Thing;

import java.util.ArrayList;
import java.util.List;

public class Street extends Subject {
    private String name = " улица ";

//    public class Description implements Describing {
//        private String characteristic1 = "Самая большая ";
//        private String characteristic2 = " самая красивая ";
//
//        @Override
//        public String getDescribe() {
//            return characteristic1+characteristic2;
//        }
//    }

    public Street() {
        addActivity(new Drag());
    }

}
