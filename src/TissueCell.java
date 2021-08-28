public class TissueCell extends Cell {

    public TissueCell(int x, int y) {
        super(0, x,y , 1);
        }

        @Override
        public void interactNeighbours() {
        }

        public static void main(String[] args) {
        TissueCell rough = new TissueCell (2,7);
            System.out.println("Done");
        }

}
