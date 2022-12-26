import java.util.Scanner;
public class Movie {
     int age, number; double amount;
        void fee() {
            Scanner sc = new Scanner(System.in);
            System.out.println("select number of person");
            number = sc.nextInt();
            for(int i=0;i<number;i++) {
                System.out.println("select age");
                age = sc.nextInt();
               
                if (age <3) {
                    amount+= 0;
                    System.out.println("free");
                } else if (age > 3 && age <=12) {
                    amount += 100;
                } else if (age >= 13) {
                    amount += 150;
                }
            }
            sc.close();
            System.out.println("Total member is: "+number);
            System.out.println("Total billing amount is: "+amount);

        }
    public static void main(String[] args) {
    Movie m=new Movie();
    m.fee();
    }
}