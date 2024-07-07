//Lec 1:
// QUe:print "Hello World!"

// class FirstClass{
//     public static void main(String args[]) {
//         System.out.println("Hello World!");
//     }
// }

//Lec 2:
// print pattern:
//  *
//  **
//  ***
//  ****

// import java.util.*;
// public class secondClass{
//     public static void main(String args[]){

//         //output
//         // System.out.println("*");
//         // System.out.println("**");
//         // System.out.println("***");
//         // System.out.println("****");

//         //variable
//         // int a=25,b=20;
//         // int result=2*(a+b);
//         // System.out.print("Area of rectangle : "+result);

//         //input
//         // Scanner sc=new Scanner(System.in);
//         // String name=sc.nextLine();

//         // System.out.println(name);

//     }
// }

// Practice Que: take 2 variables 'a' & 'b' and print their sum. :

// import java.util.*;

// public class pr1{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);

//             int a=sc.nextInt();
//             int b=sc.nextInt();

//             int sum=a + b;
//             System.out.println("Sum Of Two Numbrs : "+sum);
//         }

// }

//Que :
//  Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

// import java.util.*;

// public class pr2{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);
//             double pi=3.14;
//            double radius=sc.nextDouble();

//            double area=pi*radius*radius;
//             System.out.println("Area Of Rectangle : "+area);
//         }

// }

// Que :
// Make a program that prints the table of a number that is input by the user. 

// import java.util.*;

// public class pr3{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);

//             int num=sc.nextInt();

//             for(int i=1;i<=10;i++){
//                 System.out.println(num+" * "+i+" = " +num*i);
//             }
//         }

// }

//Lec 3 : Conditional Statments 

//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

//     import java.util.*;

// public class pr4{
//         public static void main(String[] args) {
//             Scanner sc=new Scanner(System.in);

//             int a=sc.nextInt();
//             int b=sc.nextInt();
// int result;

//             System.out.println("1.Addition");
//             System.out.println("2.Subtraction");
//             System.out.println("3.Multipication");
//             System.out.println("4.Division");
//             System.out.println("5.Division");
// System.out.println("Please Choose An Operation Frm Above:");
//             int choice=sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     result=a+b;
//                     System.out.println("Addition Of A & B : "+result);
//                     break;

//                     case 2:
//                     result=a-b;
//                     System.out.println("Subtraction Of A & B : "+result);
//                     break;

//                     case 3:
//                     result=a*b;
//                     System.out.println("Multipication Of A & B : "+result);
//                     break;

//                     case 4:
//                     result=a/b;
//                     System.out.println("Division Of A & B : "+result);
//                     break;

//                     case 5:
//                     result=a%b;
//                     System.out.println("Modulas Of A & B : "+result);
//                     break;

//                 default:
//                     System.out.println("Enter valid Choice!!");

//             }

//         }

// }

//Que : Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

//  import java.util.*;

//  public class pr5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Please Enter The Number Of Month : ");
//         int choice = sc.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("January");
//                 break;

//             case 2:
//                 System.out.println("February");
//                 break;

//             case 3:
//                 System.out.println("March");
//                 break;

//             case 4:
//                 System.out.println("April");
//                 break;

//             case 5:
//                 System.out.println("May");
//                 break;

//             case 6:
//                 System.out.println("June");
//                 break;

//             case 7:
//                 System.out.println("July");
//                 break;

//             case 8:
//                 System.out.println("August");
//                 break;

//             case 9:
//                 System.out.println("September");
//                 break;

//             case 10:
//                 System.out.println("October");
//                 break;

//             case 11:
//                 System.out.println("November");
//                 break;

//             case 12:
//                 System.out.println("December");
//                 break;

//             default:
//                 System.out.println("Plase Enter valid Number!!");
//                 break;
//         }

//     }

// }

// Lec-4 : Loops In Java

// Que: Print Sum of First n Natural Numbers.

// import java.util.*;

// public class pr6{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter The Number of Sum you Want : ");
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             sum += i;
//         }
//         System.out.println(sum);
//     }
// }

//HomeWork problem::
// Que:
// Make a menu driven Program .the user can enter 2 numbers,wither 1 or 0. if the user enter 1 keep taking input from users for marks(out of 100).
// if they enter 0 then stop.

// if marks>=90 -print "This is Good"
// 89>=marks 60 -pint "this is also Good"
// 59-0 - print "This is Good As Well"

// import java.util.*;

// public class pr7 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//          System.out.println("1.For Input the record of marks");
//         System.out.println("0.For Exit ");
//         System.out.println("Please Choose From Above");

//         int choice=sc.nextInt();
//         switch (choice) {
//             case 0:
//                 System.out.println("Exiting The Program!");
//                 break;

//             case 1:
//             System.out.println("Enter The Marks");
//             int x=sc.nextInt();
//                 if(x>=90){
//                     System.out.println("This is Good");
//                 }
//                 else if(x>=60&&x<=89){
//                     System.out.println("This is Also Good");
//                 }
//                 else{
//                     System.out.println("This Is good As Well");
//                 }

//                 break;       

//             default:
//                 System.out.println("Enter Valid Choice!!");
//                 break;
//         }

//     }
// }

//Lec-5 9 best pattern Que:

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // que1:
        // *****
        // *****
        // *****
        // *****

        // //outer loop
        // for(int i=0;i<4;i++){

        // //inner loop
        // for(int j=0;j<5;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // que 2: Hollow rectangle
        // * * * * *
        // * *
        // * *
        // * * * * *

        // int n=4;
        // int m=5;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=m;j++){
        // if (i==1||i==n||j==1||j==m) {
        // System.out.print("*");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // que 3 : Half Pyramid
        // *
        // * *
        // * * *
        // * * * *

        // int n=4;

        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){

        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // que 4 : Half Pyramid
        // * * * *
        // * * *
        // * *
        // *

        // int n=4;

        // for(int i=n;i>=1;i--){
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // que 5: Inverted Half Pyramid
        // *                            No.of Spaces is must to focus because here space value is  n-1.
        // * *
        // * * *
        // * * * *

        // int n = 4;

        // //outer loop
        // for (int i = 1; i <= n; i++) {

        //     // inner loop -> for spaces
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //      // inner loop -> for spaces
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // que 6 : half Pyramid with Numbers:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4 
        // 1 2 3 4 5 

        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //que 7 :Inverted half pyramid with numbers:
        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3  
        // 1 2
        // 1

        // int n=5;

        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //que 8: Floyd's Triangle

        // 1 
        // 2  3
        // 4  5  6
        // 7  8  9  10 
        // 11 12 13 14 15


        // int n=5;
        // int num=1;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

            //que 9 : 0-1 Triangle
            // 1
            // 0 1 
            // 1 0 1
            // 0 1 0 1
            // 1 0 1 0 1

            
        // int n=5;
        
        // for(int i=1;i<=n;i++){
            
        //     for(int j=1;j<=i;j++){
                
        //       int pat=i+j;
        //       if (pat %2==0) {
        //         System.out.print("1 ");
                
        //       }
        //       else{
        //         System.out.print("0 ");
        //       }
                
        //     }
        //     System.out.println();
        // }

        // LEC 6: Advance  Pattern Question :-

        // Que 1: Butterfly Pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        // int n=4;
        
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces= 2*(n-i);
        //     for(int j=1 ; j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // 2nd half

        // for(int i=n;i>=1;i--){
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     int spaces= 2*(n-i);
        //     for(int j=1 ; j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // QUe 2: Solid Rhombus pattern :
    //     *****
    //     *****
    //    *****
    //   *****
    //  *****


    //     int n=5;

    //     for(int i=1;i<=n;i++){
    //         int spaces=5-i;
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print(" ");
    //         }

    //         for(int j=1;j<=5;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

        // Que 3: Number Pyramid 
    //      1 
    //     2 2
    //    3 3 3
    //   4 4 4 4
    //  5 5 5 5 5

        // int n=5;

        // for(int i=1;i<=n;i++){
        //     int spaces=5-i;
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //         System.out.print(" ");
        //     }
           
        //     System.out.println();

        // }

        // Que : 4 Palindromic Pattern

    //     1
    //     212
    //    32123
    //   4321234
    //  543212345

        // int n=5;

        // for(int i=1;i<=n;i++){
        //     int spaces=5-i;
        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>=1;j--){
        //         System.out.print(j);
               
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print(j);
               
        //     }
        //     System.out.println();
        // }


        // Que 5 : Diamond PAttern :

    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *

        // int n=4;

        // for(int i=1;i<=n;i++){
        //     int spaces= 5-i;

        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // //2nd Half

        // for(int i=n;i>=1;i--){
        //     int spaces= 5-i;

        //     for(int j=1;j<=spaces;j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     for(int j=2;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        
    }
}
