package lab.activity;

public class Ensure extends Activity {
    public Ensure(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "убедился ";
    }

    @Override
    public String getActivityName() {
        return "Ensure";
    }
}
