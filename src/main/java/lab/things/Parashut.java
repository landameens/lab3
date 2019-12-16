package lab.things;

public class Parashut implements Thing {
    private String name = " парашют";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {

    }

    public static class Hill implements Thing {
        private String name = " холм";

    //    public static class Plant implements Describing {
    //        private String grass = " зеленая травка ";
    //        private String bush = " мелкий кустарник";
    //        @Override
    //        public String getDescribe() {
    //            return grass+bush;
    //        }
    //    }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void exist() {
        }
    }
}
