import java.util.*;
import java.util.Scanner;
public class lec4_loops {
    public static void main(String[] args) {

        //numbers from 1 to 10
//        int num=1;
//        while(num<=10){
//            System.out.println(num);
//            num++;
//        }
//        System.out.println("Numbers from 1 to 10");

        //numbers from 1 to n
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the number: ");
//        int num = sc.nextInt();
//
//        int counter=1;
//        while(counter<=num){
//            System.out.println(counter);
//            counter++;
//        }

        //sum of n natural nums
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the num: ");
//        int num=sc.nextInt();
//
//        int sum=0;
//        int i=1;
//        while(i<=num){
//            sum+=i;
//            i++;
//        }
//        System.out.println(sum);


        //square pattern
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //reverse of a number
//        int num=12345;
//        while(num>0){
//            int lastDigit = num%10;
//            System.out.print(lastDigit);
//            num/=10;
//        }
//        System.out.println();


        //keep entering numbers till user enters a multiple of 10
//        Scanner sc = new Scanner(System.in);
//
//        do{
//            System.out.println("enter the number: ");
//            int n = sc.nextInt();
//            if(n%10==0){
//                break;
//            }
//            System.out.println(n);
//        }while(true);


        //display all numbers entered by user except multiples of 10
//        Scanner sc = new Scanner(System.in);
//        do{
//            System.out.println("enter the number: ");
//            int n = sc.nextInt();
//            if(n%10==0)
//                continue;
//            else
//                System.out.println(n);
//        }while(true);


        //check whether the number is prime or not
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number: ");
//        int num = sc.nextInt();
//
//        if(num==2)
//            System.out.println("the number is prime");
//        else{
//            boolean isPrime = true;
//            for(int i=2;i<=num-1;i++){
//                if(num%i==0){
//                    isPrime=false;
//                }
//            }
//            if(isPrime==true){
//                System.out.println("number is prime");
//            }
//            else{
//                System.out.println("number is not prime");
//            }
//        }
            //with the help of Math.sqrt() keyword to reduce the time
//        else{
//            boolean isPrime = true;
//            for(int i=2;i<=Math.sqrt(num);i++){
//                if(num%i==0){
//                    isPrime=false;
//                }
//            }
//            if(isPrime==true){
//                System.out.println("number is prime");
//            }
//            else{
//                System.out.println("number is not prime");
//            }
//        }


        //table of a number
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        for(int i=1;i<=10;i++){
//            int mul=n*i;
//            System.out.println(n + "*" + i + "=" + mul);
//        }
    }
}
