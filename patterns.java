public class patterns {
    //public static void main(String[] args) {

    //star pattern 1
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    //star pattern 2
//        for(int i=1;i<=4;i++){
//            for(int j=4;j>=i;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    //pattern 3
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

    //pattern 4
//        char ch='A';
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }


    //pattern 5(hollow rectangle)
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                if(i==1 || j==1 || i==4 || j==4){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }


    //pattern 6(inverted and rotated half pyramid)
//    public static void getPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        getPattern(4);
//    }

    //pattern 7(inverted half pattern with numbers)
//    public static void getPattern(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=6-i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        getPattern(5);
//    }


    //pattern 8(floyd's triangle)

//    public static void floydTriangle(int n){
//        int counter=1;
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(counter+ " ");
//                counter++;
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        floydTriangle(4);
//    }

        //pattern 9 butterfly pattern
    public static void butterFly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces- 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n;i>=1;i--){
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces- 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterFly(4 );
    }

    //pattern 10 solid rhombus

//    public static void solid_rhombus(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        solid_rhombus(5);
//    }

    //diamond pattern
//    public static void diamondPattern(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=n;i>=1;i--){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=2*i-1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//
//        diamondPattern(5);
//    }


}
