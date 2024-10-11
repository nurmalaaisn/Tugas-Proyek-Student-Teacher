public class Teacher extends Person {

    protected String subject;

    public Teacher() {
        super();
        subject = "";
    }

    public Teacher(String name, String subject, int age) {
        super(name, age);
        this.subject = subject;
    }

    public void print() {
        System.out.println("Subject : " + subject);
    }

}
