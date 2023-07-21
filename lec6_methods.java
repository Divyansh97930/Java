import java.util.*;
public class lec6_methods {

//    public static void calculateSum(int a, int b){
//        int sum=a+b;
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a: ");
//        int a=sc.nextInt();
//        System.out.println("enter b: ");
//        int b=sc.nextInt();
//        calculateSum(a,b);


    //product of 2 nums

//      public static int product(int num1, int num2){
//          int prod = num1*num2;
//          System.out.println("the product is: "+ prod);
//          return prod;
//      }
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println("enter a: ");
//          int a = sc.nextInt();
//          System.out.println("enter b: ");
//          int b= sc.nextInt();
//          product(a,b);

//}
            //factorial of a number
                //user input
//            public static int factorial(int a){
//                int fact=1;
//                for(int i=1;i<=a;i++){
//                    fact=fact*i;
//                }
//                return fact;
//            }
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("enter n: ");
//                int n=sc.nextInt();
//                int fact= factorial(n);
//                System.out.println("ans is: " + fact);
//            }

            //factorial of a number
//         public static int factorial(int n){
//             int fact=1;
//             for(int i=1;i<=n;i++){
//                 fact*=i;
//             }
//             System.out.println("ans is: " + fact);
//             return fact;
//         }
//         public static void main(String[] args) {
//            factorial(5);
//    }

            //binomial coefficient
//            public static int factorial(int n) {
//                int fact = 1;
//                for (int i = 1; i <= n; i++) {
//                    fact *= i;
//                }
//              //   System.out.println("ans is: " + fact);
//                return fact;
//            }
//
//            public static int bin_coeff(int n, int r){
//                int fact_n= factorial(5);
//                int fact_r= factorial(r);
//                int fact_nmr= factorial(n-r);
//
//                int bin_coeff=fact_n/(fact_r * fact_nmr);
//                return bin_coeff;
//            }
//
//            public static void main(String[] args) {
//                int ans = bin_coeff(5,2);
//                System.out.println("ans is: "+ ans);
//    }


        //check number is prime or not
//        public static boolean isPrime(int n){
//            for(int i=2;i<=n-1;i++){
//                if(n%i==0){
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        public static void main(String[] args) {
//            System.out.println(isPrime(2));
//    }

        //optimized code for prime
//        public static boolean isPrime(int n){
//            if(n==2){
//                return true;
//            }
//            for(int i=2;i<=Math.sqrt(n);i++){
//                if(n%i==0){
//                    return false;
//                }
//            }
//            return true;
//        }
//
//       public static void main(String[] args) {
//           System.out.println(isPrime(100034));
//    }


        //primes in range
//        public static boolean isPrime(int n){
//            if(n==2){
//                return true;
//            }
//            for(int i=2;i<=Math.sqrt(n);i++){
//                if(n%i==0){
//                    return false;
//                }
//            }
//            return true;
//        }
//
//        public static void primeInRange(int n){
//            for(int i=2;i<=n;i++){
//                if(isPrime(i)){
//                    System.out.println(i + " ");
//                }
//            }
//            System.out.println();
//        }
//
//        public static void main(String[] args) {
//            primeInRange(20);
//    }


      //binary to decimal
//        public static void binToDec(int n){
//            int original_num=n;
//            int pow=0;
//            int dec=0;
//            while(n>0){
//                int lastDigit=n%10;
//                dec=dec+(lastDigit * (int)Math.pow(2,pow));
//                pow++;
//                n/=10;
//            }
//            System.out.println("the decimal form of " + original_num+ " is: "+ dec);
//        }
//
//        public static void main(String[] args) {
//            binToDec(101001110);
//    }


        //average of three nums
//            public static float avgOfThreeNums(float a, float b, float c){
//                float avg = (a+b+c)/3;
//                System.out.println(avg);
//                return avg;
//            }
//
//    public static void main(String[] args) {
//            float avg = avgOfThreeNums(7.2f,20.3f,7.5f);
//
//    }

        //even or odd
//        public static boolean isEven(int n){
//            if(n%2==0){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//
//    public static void main(String[] args) {
//        System.out.println(isEven(2));
//        }


             //math class
//        public static void mathClass(int a, int b) {
//            System.out.println("The minimum of two nums is: " + Math.min(a,b));
//            System.out.println("The maximum of two nums is: " + Math.max(a,b));
//            System.out.println("The square root of b is: " + (int)Math.sqrt(b));
//            System.out.println(a + " raise to " + " power " + b + " is " + Math.pow(a,b));
//          //  System.out.println("The average of two nums is: " + Math.avg(a,b));
//            System.out.println("The abs of a is: " + Math.abs(a));
//        }
//
//        public static void main(String[] args) {
//            mathClass(28,4);
//    }




}

