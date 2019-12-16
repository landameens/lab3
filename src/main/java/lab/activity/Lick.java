package lab.activity;

public class Lick extends Activity {
    public Lick(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    public Lick() {

    }

    @Override
    protected String createMainPart() {
        return "полизав ";
    }

    @Override
    public String getActivityName() {
        return "Lick";
    }
}
