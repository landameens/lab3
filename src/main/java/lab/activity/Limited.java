package lab.activity;

public class Limited extends Activity {
    public Limited(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    public Limited() {

    }

    @Override
    protected String createMainPart() {
        return "ограничен ";
    }

    @Override
    public String getActivityName() {
        return "Limited";
    }
}
