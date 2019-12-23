package lab.activity;

public class Start extends Activity {
    public Start(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "принялся ";
    }

    @Override
    public String getActivityName() {
        return "Start";
    }
}
