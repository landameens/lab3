package lab.activity;

public class Parashute extends Activity {
    public Parashute(String objectName, String characteristic){
        super(objectName,characteristic);
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
