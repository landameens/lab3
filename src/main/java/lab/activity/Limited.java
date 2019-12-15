package lab.activity;

public class Limited extends Activity {
    public Limited(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "ограничен ";
    }

    @Override
    protected String getActivityName() {
        return "Limited";
    }
}
