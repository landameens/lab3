package lab.activity;

public class Come extends Activity {
    public Come(String objectName, String characteristic){
        super(objectName,characteristic);
      //  this.objectName =objectName;
       // this.characteristic=characteristic;
    }

    public Come() {

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
