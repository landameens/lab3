package lab.activity;

public class Fill extends Activity {
    public Fill(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "набил ";
    }

    @Override
    protected String getActivityName() {
        return "Fill";
    }
}