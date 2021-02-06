class Sheriff extends Person {
    String workState;
    public Sheriff(String name,int bornYear,String workState){
        super(name, bornYear);
     
        this.workState= workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in " + workState + ".");

    }
    public void introduce1(){
        super.introduce();
        System.out.println("I'm a teacher and teach the student in " + workState + ".");
}
    public void introduce2(){
    super.introduce();
    System.out.println("I'm a prime minister and work in " + workState + ".");
}
public void introduce3(){
    super.introduce();
    System.out.println("I'm a football plater and work in " + workState + ".");
}
public void introduce4(){
    super.introduce();
    System.out.println("I'm a student and study in " + workState + ".");
}
 }