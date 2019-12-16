package lab.activity;

public class Placed extends Activity {
    public Placed(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
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
