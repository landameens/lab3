package lab.things;

public class Cristall implements Thing{
    private String name = " кристаллы ";

    public class Describe implements Describing{
        private String characteristic1 = " обыкновенной";
        private String characteristic2 = " поваренной ";

        @Override
        public String getDescribe() {
            return characteristic1+", "+characteristic2+"соли";
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist(){
    }
}
