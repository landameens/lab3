package lab.activity;

public class Chose extends Activity {
    public Chose(String objectName, String characteristic){
        this.objectName =objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "выбрал";
    }

    @Override
    protected String getActivityName() {
        return "Chose";
    }
}
