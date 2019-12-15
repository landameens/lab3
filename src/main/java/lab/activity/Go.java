package lab.activity;

public class Go extends Activity {
    public Go(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "зашагал ";
    }

    @Override
    protected String getActivityName() {
        return "Go";
    }
}
