package lab.activity;

public class Parashute extends Activity {
    public Parashute(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    public Parashute() {
    }

    @Override
    protected String createMainPart() {
        return "спускался ";
    }

    @Override
    public String getActivityName() {
        return "Parashute";
    }
}
