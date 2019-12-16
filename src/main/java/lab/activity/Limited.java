package lab.activity;

public class Limited extends Activity {
    public Limited(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    public Limited() {

    }

    @Override
    protected String createMainPart() {
        return "ограничен ";
    }

    @Override
    public String getActivityName() {
        return "Limited";
    }
}
