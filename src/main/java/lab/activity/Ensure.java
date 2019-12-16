package lab.activity;

public class Ensure extends Activity {
    public Ensure(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "убедился ";
    }

    @Override
    public String getActivityName() {
        return "Ensure";
    }
}
