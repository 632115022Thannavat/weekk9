package Shape;

public class cube extends Rectangle {
    int length;
    private String s = "This is cube with a size of ";
    public cube(int width, int height,int length){
    super (width,height);
    this.length = length;
    }

    public String toString(){
        return s+length;
    }
}
