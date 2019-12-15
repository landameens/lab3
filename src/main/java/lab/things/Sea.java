package lab.things;

public class Sea implements Thing{
    private String name = " море ";

    public String Form(){
        return " образовало залив ";
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {
    }


}
