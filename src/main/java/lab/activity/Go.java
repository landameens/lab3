package lab.activity;

public class Go extends Activity {
    public Go(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    public Go() {

    }

    @Override
    protected String createMainPart() {
        return "зашагал ";
    }

    @Override
    public String getActivityName() {
        return "Go";
    }
}
