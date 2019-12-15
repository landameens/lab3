package lab.things;

public class City implements Thing {
    private String name;

    public City(String name){
        this.name = name;
    }

    public String Description(){
        class Picture {
            public String climat = " отличнейший климат ";
            public String whatDo = " можно было ";
        }
        Picture picture = new Picture();
        return picture.climat + picture.whatDo;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {
    }

}
