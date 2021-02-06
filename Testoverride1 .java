public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();
        Person person2;
        person2 = new Sheriff("Mateo",1988,"Califonia");
        person2.introduce();
        Person person3;
        person3 = new Sheriff("Ball",1977,"CMU");
        person3.introduce1();
        Person person4;
        person4 = new Sheriff("Tu",1957,"Thailand");
        person4.introduce2();
        Person person5;
        person5 = new Sheriff("Messi",1987,"Barcelona football club");
        person5.introduce3();
        Person person6;
        person6 = new Sheriff("Donny",2002,"CMU");
        person6.introduce4();
    }
}