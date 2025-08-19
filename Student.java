import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=s.nextLine();
        System.out.println("Enter your age:");
        int age=s.nextInt();
        System.out.println("Enter your gender M (or) F:");
        char gender=s.next().charAt(0);
        System.out.println("Enter your class :");
        int standard=s.nextInt();
        System.out.println("Enter your marks for sub1:");
        double sub1=s.nextDouble();
        System.out.println("Enter your marks for sub2:");
        double sub2=s.nextDouble();
        System.out.println("Enter your marks for sub3:");
        double sub3=s.nextDouble();
        double total=sub1+sub2+sub3;
        double avg=total/3;
        double per=avg;
        System.out.println("The total marks are: " +total);
        System.out.println("The average of the Student is: " +avg+ "%");
        int perint=(int)per;
        System.out.println("The percentage of the student:" +perint);
        String status=(perint>30)?"Pass":"Fail";
        System.out.println("The student status is:" +status);
    }
}