package lab.activity;

public class Drag extends Activity {

    public Drag(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "тянулся ";
    }

    @Override
    public String getActivityName() {
        return "Drag";
    }

}
