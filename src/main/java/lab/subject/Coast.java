package lab.subject;

import lab.activity.*;

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

    public Coast(Drag drag, Limited limited, Covered covered) {
        addActivity(drag);
        addActivity(limited);
        addActivity(covered);
    }

}
