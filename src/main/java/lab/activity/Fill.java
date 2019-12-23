package lab.activity;

public class Fill extends Activity {
    public Fill(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "набил ";
    }

    @Override
    public String getActivityName() {
        return "Fill";
    }
}
