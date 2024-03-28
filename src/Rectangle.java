public class Rectangle extends  Shape{
    int height;
    int width;

    public Rectangle(int posx, int posy, String color, int height, int width) {
        super(posx, posy, color);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(){
        System.out.println("drawing rectangle with" + height + "height" );
    }
}
