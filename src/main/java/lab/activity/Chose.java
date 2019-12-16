package lab.activity;

public class Chose extends Activity {
    public Chose(String objectName, String characteristic){
        super(objectName,characteristic);
       // this.objectName =objectName;
        //this.characteristic=characteristic;
    }

    public Chose() {

    }

    @Override
    protected String createMainPart() {
        return "выбрал";
    }

    @Override
    public String getActivityName() {
        return "Chose";
    }
}
