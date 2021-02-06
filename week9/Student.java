package week9;
import java.util.Scanner;
public class Student{
    public String str[] = new String[1];
    Scanner s = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    private String firstname = s.nextLine();
    private String lastname = ss.nextLine();
    public String toString(){
        return "My first name "+firstname+" last name "+lastname;
    }
    public static void main(String[] args) {
        Student p = new Student();
        System.out.println(p.toString());
    }
}
