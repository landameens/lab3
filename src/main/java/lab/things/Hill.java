package lab.things;

public class Hill implements Thing {
    private String name = " холм";

    public static class Plant implements Describing{
        private String grass = " зеленая травка ";
        private String bush = " мелкий кустарник";
        @Override
        public String getDescribe() {
            return grass+bush;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {
    }
}
