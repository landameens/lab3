package lab.activity;

public class Party extends Activity {
    public Party(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "повеселиться ";
    }

    @Override
    protected String getActivityName() {
        return "Party";
    }
}
