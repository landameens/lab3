package lab.things;

public class Stone implements Thing {

    private String name = " камни ";

    public String Similar(){
        class Block{
            private String name = " обломки глыб ";
        }
        Block block = new Block();
        return " похожие на "+block.name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void exist() {

    }
}
