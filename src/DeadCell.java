public class DeadCell extends Cell {

    public DeadCell(int x, int y) {
        super(0,x,y,0);
    }

    @Override
    public void interactNeighbours() {
    }

    public static void main(String[] args) {
        DeadCell rough = new DeadCell (2,7);
        System.out.println("Done");
    }
}
