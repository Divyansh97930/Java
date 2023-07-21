import java.util.Scanner;
public class lec3_conditional {
    public static void main(String[] args) {
        //largest of 2 nums
//        int a = 1, b = 3;
//        if (a > b)
//            System.out.println("a is greater" + a);
//        else
//            System.out.println("b is greater "+b);

        //Even odd
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//        if(num%2==0)
//            System.out.println("number is even");
//        else
//            System.out.println("the number is odd");

        //tax calculation
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

        //largest of 3 nums

//        int a = 1, b=4, c=5;
//        if(a>=b && a>=c)
//            System.out.println("a is largest");
//        else if(b>=c)
//            System.out.println("b is largest");
//        else
//            System.out.println("c is largest");

        //check whether pass or fail
        int marks=70;
        String result = (marks>=33)?"PASS":"FAIL";
        System.out.println(result);
    }
}
