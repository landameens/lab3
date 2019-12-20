package lab.activity;

public class Placed extends Activity {
    public Placed(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "расположился ";
    }

    @Override
    public String getActivityName() {
        return "Placed";
    }
}
