package lab.activity;

public class Parashute extends Activity {
    public Parashute(String objectName, String characteristic){
        super(objectName,characteristic);
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
