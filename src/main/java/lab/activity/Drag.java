package lab.activity;

public class Drag extends Activity {
    public Drag(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "тянулся ";
    }

    @Override
    protected String getActivityName() {
        return "Drag";
    }
}