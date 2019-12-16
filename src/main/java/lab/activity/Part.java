package lab.activity;

public class Part extends Activity {
    public Part(String objectName, String characteristic){
        super(objectName,characteristic);
      //  this.objectName=objectName;
        //this.characteristic=characteristic;
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
