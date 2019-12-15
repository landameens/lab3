package lab.things;

public class Jacket implements Thing {
    private String name = " курточка";

    @Override
    public String getName() {
        return name;
    }

    public static class Pocket extends Jacket{
        private String name = " карманы";

        @Override
        public String getName() {
            return name;
        }
    }
    @Override
    public void exist() {
    }


}
