public class Circle extends Shape{
    int radius;
    public Circle (int posx, int posy, String color, int radius) {
        super(posx, posy, color);
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("drawing circle" + radius);
    }
}
