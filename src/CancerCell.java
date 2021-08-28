public class CancerCell extends Cell {

    public CancerCell(int x, int y) {
        super(1, x,y , 3);
    }

    @Override
    public void interactNeighbours() {
    }

    public static void main(String[] args) {
        CancerCell rough = new CancerCell (2,7);
        System.out.println("Done");
    }
}
