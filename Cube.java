public class Cube {


    //variables
    private int length;
    private int width;
    private int height;

    //constructor
    public Cube(int sides)
    {
        this.length = sides;
        this.height = sides;
        this.width = sides;
    }

    //Method 
    public void getVolume()
    {
        System.out.println(length * width * height);
    }

}