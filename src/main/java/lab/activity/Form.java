package lab.activity;

public class Form extends Activity {
    public Form(String objectName, String characteristic){
        super(objectName,characteristic);
    }

    @Override
    protected String createMainPart() {
        return "образовало";
    }

    @Override
    public String getActivityName() {
        return "Form";
    }
}
