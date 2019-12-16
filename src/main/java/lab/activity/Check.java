package lab.activity;

public class Check extends Activity {
    public Check(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    public Check() {
    }

    @Override
    protected String createMainPart() {
        return "убедился";
    }

    @Override
    public String getActivityName() {
        return "Check";
    }
}
