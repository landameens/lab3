package lab.activity;

public class Pound extends Activity {
    public Pound(String objectName, String characteristic){
        super(objectName,characteristic);
     //   this.objectName=objectName;
      //  this.characteristic=characteristic;
    }

    public Pound() {
    }

    @Override
    protected String createMainPart() {
        return "толочь ";
    }

    @Override
    public String getActivityName() {
        return "Pound";
    }
}
