package lab;

public class Clasz {
    public class InnerN  {
        private String a = "Inner non-static class";
    }

    public static class InnerS{
        private String b = "Inner static class";
    }

    public InnerS a = new InnerS(){
        private final String name = "Anonuimus";
        public void Say(){
            System.out.println(name + "ccccc");
        }
    };

    public void Loose(){
        String c = "clax";
        class You{
            public void Crew(){
                System.out.println(c);
            };
        }
    }
}
