public class partTime extends Teacher {
    int hoursworked;
    int setSalary;

    public partTime() {
        super();
        hoursworked = 0;
        setSalary = 0;
    }

    public partTime(String name, String subject, int age, int setSalary, int hoursworked) {
        super(name, subject, age);
        this.hoursworked = hoursworked;
        this.setSalary = setSalary;
    }

    public void print() {
        super.print();
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Salary : " +setSalary);
        System.out.println("Hours : " +hoursworked);

    }

}
