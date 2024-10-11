public class fullTime extends Teacher {
        String unit;
        int anualSalary;

        public fullTime(){
            super();
            unit = "";
            anualSalary = 0;
    }

    public fullTime(String name, String subject, String unit, int age, int anualSalary) {
        super(name, subject, age);
        this.unit = unit;
        this.anualSalary = anualSalary;
  
    }

    public void print() {
        super.print();
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Salary : " +anualSalary);
        System.out.println("Unit : " +unit);
    }
}
    

