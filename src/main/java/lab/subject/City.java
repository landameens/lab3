package lab.subject;

import lab.things.NotLiveSubject;

public class City extends NotLiveSubject {
    private String name;

    public City(String name){
        this.name = name;
    }

//    public String Description(){
//        class Picture {
//            public String climat = " отличнейший климат ";
//            public String whatDo = " можно было ";
//        }
//        Picture picture = new Picture();
//        return picture.climat + picture.whatDo;
//    }
}
