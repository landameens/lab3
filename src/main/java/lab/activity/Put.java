package lab.activity;

public class Put extends Activity {
    public Put(String objectName, String characteristic){
        super(objectName,characteristic);
      //  this.objectName=objectName;
      //  this.characteristic=characteristic;
    }

    public Put() {

    }

    @Override
    protected String createMainPart() {
        return "положил ";
    }

    @Override
    public String getActivityName() {
        return "Put";
    }
}
