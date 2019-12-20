package lab.activity;

public class Part extends Activity {
    public Part(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    public Part() {

    }

    @Override
    protected String createMainPart() {
        return "не привык расставаться ";
    }

    @Override
    public String getActivityName() {
        return "Part";
    }
}
