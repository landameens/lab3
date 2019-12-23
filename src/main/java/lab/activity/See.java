package lab.activity;

public class See extends Activity {
    public See(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "видел ";
    }

    @Override
    public String getActivityName() {
        return "See";
    }
}
