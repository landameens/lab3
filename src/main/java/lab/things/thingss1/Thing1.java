package lab.things.thingss1;

public class Thing1 {
    private final String NAME;
    private final String DESCRIPTION;

    public Thing1(String NAME, String DESCRIPTION){
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDescribe(){
        return DESCRIPTION;
    }
}
