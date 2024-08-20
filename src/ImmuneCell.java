import java.util.ArrayList;

public class ImmuneCell extends Cell{

    public ImmuneCell(int x, int y){
        super(3,x,y,4);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors){
        // Leave empty for now
    }
}
