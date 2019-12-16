package lab.activity;

public class See extends Activity {
    public See(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    public See() {

    }

    @Override
    protected String createMainPart() {
        return "видел ";
    }

    @Override
    public String getActivityName() {
        return "See";
    }
}
