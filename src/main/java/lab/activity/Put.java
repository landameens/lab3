package lab.activity;

public class Put extends Activity {
    public Put(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "положил ";
    }

    @Override
    protected String getActivityName() {
        return "Put";
    }
}