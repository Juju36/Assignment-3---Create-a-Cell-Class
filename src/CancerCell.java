import java.util.ArrayList;

public class CancerCell extends Cell{

    public CancerCell(int x, int y){
        super(1,x,y,3);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors) {
        // Leave blank for now
    }

}
