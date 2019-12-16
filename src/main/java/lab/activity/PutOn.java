package lab.activity;

public class PutOn extends Activity {
    public PutOn(String objectName, String characteristic){
        super(objectName,characteristic);
        //this.objectName=objectName;
       // this.characteristic=characteristic;
    }

    public PutOn() {

    }

    @Override
    protected String createMainPart() {
        return "оделся ";
    }

    @Override
    public String getActivityName() {
        return "PutOn";
    }
}
