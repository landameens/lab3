package lab.activity;

public class End extends Activity {
    public End(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
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
