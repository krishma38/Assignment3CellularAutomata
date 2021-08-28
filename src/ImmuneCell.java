public class ImmuneCell extends Cell {

    public ImmuneCell(int x, int y) {
        super(3, x,y , 4);
    }

    @Override
    public void interactNeighbours() {
    }

    public static void main(String[] args) {
        ImmuneCell rough = new ImmuneCell(2,7);
        System.out.println("Done");
    }
}