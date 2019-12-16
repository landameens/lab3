package lab.subject;

import lab.activity.Drag;

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

    public Street(Drag drag) {
        addActivity(drag);
    }

}
