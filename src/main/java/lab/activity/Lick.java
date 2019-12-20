package lab.activity;

public class Lick extends Activity {
    public Lick(String objectName, String characteristic){
        super(objectName,characteristic);
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
