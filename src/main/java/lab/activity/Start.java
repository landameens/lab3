package lab.activity;

public class Start extends Activity {
    public Start(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "принялся ";
    }

    @Override
    protected String getActivityName() {
        return "Start";
    }
}