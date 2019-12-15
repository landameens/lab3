package lab.things;

public class Salt extends Cristall implements Thing {
    private String name = " соль";

    public class Describe implements Describing{
        private String characteristic1 = " мелкая";
        private String characteristic2 = " годная для употребления в пищу";
        private String characteristic3 = " столовая ";

        @Override
        public String getDescribe() {
            return characteristic1+", "+characteristic2+", "+characteristic3+name;
        }
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {
    }

    @Override
    public String toString() {
        return "Salt []";
    }


}
