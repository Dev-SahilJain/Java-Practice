import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//  h      System.out.println("Hey! How Are You ?");
//        Scanner input = new Scanner(System.in);
//        System.out.println("Hi "+ input.nextLine());

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your number : ");
//        int number = input.nextInt();
//        System.out.println("Your number is "+ number);

//        String name = input.next();
//        System.out.println(name);

//        int one = input.nextInt();
//        int two = input.nextInt();
//
//         int sum = one + two;
//
//        System.out.println("sum is "+sum);

//       ****************** Typecasting ******************
//        int num = (int)(88.5f);
//        System.out.println(num);

//        ********************* Celsius  To Fahrenheit temp. conversion

        System.out.println("enter the temp in celsius : ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temp in Fahrenheit is : "+ tempF);
    }
}
//psvm for writing public static void
//sout for writing system.out