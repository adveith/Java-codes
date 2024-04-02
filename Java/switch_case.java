import java.util.Scanner;
public class switch_case
{
    public static void main(String[] args)
    {
        long a = 9890194717l;
        long b = 7709369717l;
        long c = 9764537877l;
        long d = 7219017107l;
        long e = 8262952017l;
        long f = 7296095467l;
        long g = 7083017057l;
        long h = 9360424045l;
        long i = 9322221438l;
        long j = 9970616109l;
        Scanner sc = new Scanner(System.in);
        
while(true){
        System.out.println("There are 10 Names in the list\n");
        System.out.println("Enter 1 to contact Adveith Walke\n");
        System.out.println("Enter 2 to contact Avinash Walke\n");
        System.out.println("Enter 3 to contact Deepa Kurup \n");
        System.out.println("Enter 4 to contact Anushka Dhokale\n");
        System.out.println("Enter 5 to contact Anika Pandit\n");
        System.out.println("Enter 6 to contact Abhigyaan Dev\n");
        System.out.println("Enter 7 to contact Aryan Gawde\n");
        System.out.println("Enter 8 to contact Manish\n");
        System.out.println("Enter 9 to contact Raj singh\n");
        System.out.println("Enter 10 to contact Sarwajeet Pratap singh\n");
        System.out.println("Enter 11 to exit\n");
        System.out.println("Enter Your Number here");
        int num= sc.nextInt();
        switch(num)
        {
            case 1:
            System.out.println("Your contact number is :-"+a);
            break;
            case 2:
            System.out.println("Your contact number is :-"+b);
            break;
            case 3:
            System.out.println("Your contact number is :-"+c);
            break;
            case 4:
            System.out.println("Your contact number is :-"+d);
            break;
            case 5:
            System.out.println("Your contact number is :-"+e);
            break;
            case 6:
            System.out.println("Your contact number is :-"+f);
            break;
            case 7:
            System.out.println("Your contact number is :-"+g);
            break;
            case 8:
            System.out.println("Your contact number is :-"+h);
            break;
            case 9:
            System.out.println("Your contact number is :-"+i);
            break;
            case 10:
            System.out.println("Your contact number is :-"+j);
            break;
            case 11:
            System.out.println("Thankyou");
            System.exit(0);
            break;
            default:
            System.out.println("Your contact number is not entered in daata :-");
        }
    }
}
}