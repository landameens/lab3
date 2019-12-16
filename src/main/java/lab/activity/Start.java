package lab.activity;

public class Start extends Activity {
    public Start(String objectName, String characteristic){
        super(objectName,characteristic);
    //    this.objectName=objectName;
      //  this.characteristic=characteristic;
    }

    public Start() {

    }

    @Override
    protected String createMainPart() {
        return "принялся ";
    }

    @Override
    public String getActivityName() {
        return "Start";
    }
}
