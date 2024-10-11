public class Person {
    protected String name;
    protected int age;

    public Person(){
        name = "";
        age = 0;
       
    }
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);

    }
    
}
