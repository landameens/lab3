package lab.activity;

public class Part extends Activity {
    public Part(String objectName, String characteristic){
        this.objectName=objectName;
        this.characteristic=characteristic;
    }

    @Override
    protected String createMainPart() {
        return "не привык расставаться ";
    }

    @Override
    protected String getActivityName() {
        return "Part";
    }
}
