package lab.activity;

public class Party extends Activity {
    public Party(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "повеселиться ";
    }

    @Override
    public String getActivityName() {
        return "Party";
    }
}
