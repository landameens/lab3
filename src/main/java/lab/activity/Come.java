package lab.activity;

public class Come extends Activity {
    public Come(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "съезжались ";
    }

    @Override
    public String getActivityName() {
        return "Come";
    }
}
