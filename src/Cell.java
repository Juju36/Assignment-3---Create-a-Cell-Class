public class Cell{

    // Instance Variables
    private int strength;
    private int x;
    private int y;
    private int id;

    // Default Constructor
    public Cell(){
        this(0, 0, 0, 0);
    }

    // Another Constructor
    public Cell(int strength, int x, int y, int id){
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    // Setters
    public void setStrength(int strength){
        if(strength > 0){
            this.strength = strength;
        } else {
            this.strength = 0;
        }
    }

    public void setX(int x){
        if(x > 0){
            this.x = x;
        } else {
            this.x = 0;
        }
    }

    public void setY(int y){
        if(y > 0){
            this.y = y;
        } else {
            this.y = 0;
        }
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    // Getters

    public int getStrength(){
        return this.strength;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getId(){
        return this.id;
    }

    public void interactNeighbors(ArrayList<Cell> neighbors){
        // leave blank for now
    }

}