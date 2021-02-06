package Shape;
public class Main {
    public static void main(String[] args) {
        
        Shape p = new Shape();
        System.out.println(p.toString());
        Rectangle rec;
        rec = new Rectangle(12,12);
        System.out.println(rec.toString());
        cube cub;
        cub = new cube(12,12,12);
        System.out.println(cub.toString());
    }
}
