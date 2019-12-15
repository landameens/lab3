package lab.activity;

public class Parashute extends Activity {
    public Parashute(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "спускался ";
    }

    @Override
    protected String getActivityName() {
        return "Parashute";
    }
}
