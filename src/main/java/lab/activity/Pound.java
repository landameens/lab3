package lab.activity;

public class Pound extends Activity {
    public Pound(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "толочь ";
    }

    @Override
    public String getActivityName() {
        return "Pound";
    }
}
