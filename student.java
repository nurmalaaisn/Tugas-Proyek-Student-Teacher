public class student extends Person {
    String major;
    int studentNumber;
    int score;

    public student() {
        super();
        major = "";
        studentNumber = 0;
        score = 0;
    }

    public student(String name, String major, int age, int studentNumber, int score) {
        super(name,age);
        this.major = major;
        this.studentNumber = studentNumber;
        this.score = score;

    }

    public void print() {
        super.print();
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Student Number : " +studentNumber);
        System.out.println("Major : " +major);
        System.out.println("score : " +score);
    }
}
