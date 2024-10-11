import java.util.Scanner;

public class worker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("Pilih :\n 1. Full Time\n 2. Part Time");
        System.out.println("=======================================");
        int pilihan = in.nextInt();
        in.nextLine();
        System.out.println("=======================================");

        if (pilihan == 1) {
            System.out.println("Subject : ");
            String subject = in.nextLine();

            System.out.println("Name : ");
            String name = in.nextLine();

            System.out.println("Age : ");
            int age = in.nextInt();
            in.nextLine();

            System.out.println("Salary : ");
            int anualSalary = in.nextInt();
            in.nextLine();

            System.out.println("Unit : ");
            String unit = in.nextLine();

            System.out.println("=======================================");
            fullTime ft1 = new fullTime(name, subject, unit, age, anualSalary);
            ft1.print();
            System.out.println("=======================================");

        } else if (pilihan == 2) {
            System.out.println("Subject : ");
            String subject = in.nextLine();

            System.out.println("Name : ");
            String name = in.nextLine();

            System.out.println("Age : ");
            int age = in.nextInt();
            in.nextLine();

            System.out.println("Salary : ");
            int setSalary = in.nextInt();
            in.nextLine();

            System.out.println("Hours : ");
            int hoursworked = in.nextInt();
            in.nextLine();

            System.out.println("=======================================");
            partTime pt1 = new partTime(name, subject, age, setSalary, hoursworked);
            pt1.print();
            System.out.println("=======================================");

        } else {
            System.out.println("Input Salah");
        }

        in.close();
    }

}
