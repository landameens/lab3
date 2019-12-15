package lab.activity;

public class Covered extends Activity {
    public Covered(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "покрыт ";
    }

    @Override
    protected String getActivityName() {
        return "Covered";
    }
}
