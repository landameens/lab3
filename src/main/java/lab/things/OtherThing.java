package lab.things;

public class OtherThing implements Thing {
    public static final String NAME = " все что попадается в руки";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void exist() {
    }

    @Override
    public String toString() {
        return "AllThing []";
    }


}
