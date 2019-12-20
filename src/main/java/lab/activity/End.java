package lab.activity;

public class End extends Activity {
    public End(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    public End() {

    }

    @Override
    protected String createMainPart() {
        return "получилась ";
    }

    @Override
    public String getActivityName() {
        return "End";
    }
}
