package lab.activity;

public class Check extends Activity {
    public Check(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    public Check() {
    }

    @Override
    protected String createMainPart() {
        return "осмотрел";
    }

    @Override
    public String getActivityName() {
        return "Check";
    }
}
