package Shape;

public class Rectangle extends Shape{
    int width;
    int height;
    private String s = "this is a rectangle width as ";
    private String ss = " and height as ";
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return s+width+ss+height;
    }
}
