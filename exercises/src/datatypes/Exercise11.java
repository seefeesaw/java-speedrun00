package datatypes;

import java.util.Scanner;

//public class Exercise11 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input six non-negative digits: ");
//        String input = in.nextLine();
//
////        if (!input.matches("\\d{6}")) {
////            System.out.println("Please enter exactly six digits.");
////            return;
////        }
//
//        for (int i = 0; i < input.length(); i++) {
//            System.out.print(input.charAt(i));
//            if (i < input.length() - 1) {
//                System.out.print(" ");
//            }
//        }
//        System.out.println();
//    }
//}


import java.util.Scanner;
public class Exercise11 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input six non-negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        System.out.printf("Input n1: %d ",n1);
        int n2 = input / 10000 % 10;
        System.out.printf("Input n2: %d ",n2);
        int n3 = input / 1000 % 10;
        System.out.printf("Input n3: %d ",n3);
        int n4 = input / 100 % 10;
        System.out.printf("Input n4: %d ",n4);
        int n5 = input / 10 % 10;
        System.out.printf("Input n5: %d ",n5);
        int n6 = input % 10;
        System.out.printf("Input n6: %d ",n6);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);

    }
}

