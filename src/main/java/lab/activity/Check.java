package lab.activity;

public class Check extends Activity {
    public Check(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "убедился";
    }

    @Override
    protected String getActivityName() {
        return "Check";
    }
}
