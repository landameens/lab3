package lab.activity;

public class Come extends Activity {
    public Come(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "съезжались ";
    }

    @Override
    protected String getActivityName() {
        return "Come";
    }
}
