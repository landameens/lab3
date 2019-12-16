package lab.activity;

public abstract class Activity {
    protected String objectName;
    protected String activityName;
    protected String characteristic;


    //template method
    public String execute() {
        String result = "";

        result += objectName;
        result += createMainPart();
        result += characteristic;

        return result;
    }

    protected abstract String createMainPart();
    public abstract String getActivityName();
}