package lab.activity;

public abstract class Activity {
    private String objectName;
    private String activityName;
    private String characteristic;

   public Activity(String objectName, String characteristic) {
       this.objectName = objectName;
       this.characteristic = characteristic;
   }

   public Activity() {}

    //template method
    public String execute() {
        return getCharacteristic() + " " + getObjectName() + " " + createMainPart();
    }

    protected abstract String createMainPart();
    public abstract String getActivityName();

    public String getCharacteristic() {
        return characteristic;
    }

    public String getObjectName() {
        return objectName;
    }
}