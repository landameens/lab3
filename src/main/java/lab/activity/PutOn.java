package lab.activity;

public class PutOn extends Activity {
    public PutOn(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "оделся ";
    }

    @Override
    protected String getActivityName() {
        return "PutOn";
    }
}
