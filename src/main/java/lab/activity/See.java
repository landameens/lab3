package lab.activity;

public class See extends Activity {
    public See(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "видел ";
    }

    @Override
    protected String getActivityName() {
        return "See";
    }
}
