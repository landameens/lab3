package lab.activity;

public class End extends Activity {
    public End(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "получилась ";
    }

    @Override
    protected String getActivityName() {
        return "End";
    }
}
