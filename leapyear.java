import java.utill.scanner;

public class leapYear {
    public static void main(String[]args){
        scanner sc = new Scanner(System.in);
        system.out.print("eneter a year:");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 !=0)|| year % 400 ==0)
            system.out.println(year + "is a leap year");
        else
            system.out.println(year + "is not a leap year")    


    }
}