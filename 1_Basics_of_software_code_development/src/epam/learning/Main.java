package epam.learning;

import java.util.Scanner;

public class Main {

    // №1.1
//
//
//    public static void main(String[] args) {
//
//        function (4, 4, 4);
//    }
//
//    private static void function (int a, int b, int c) {
//        int z = ((a - 3) * b/2) + c;
//        System.out.println("z = " + z);
//    }


    //  №1.2
//
//
//    public static void main(String[] args) {
//
//    function (7,3,5);
//
//    }
//
//    private static void function (int a, int b, int c) {
//        System.out.println("function = " + (((b + Math.sqrt(Math.pow(b, 2) +
//                4 * a * c)) / 2 * a) - 3 * Math.pow(a, 3) * 3 + Math.pow(b, -2)));
//    }


    // №1.3
//
//
//    public static void main(String[] args) {
//
//    function (7,3);
//
//    }
//
//    private static void function (int x, int y) {
//        System.out.println("function = " + ((Math.sin(x) +
//                Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y));
//    }



        // №1.4


//    public static void main(String[] args) {
//
//    myFunction (567.789);
//
//    }
//
//    private static void myFunction (double a) {
//
//        double ddd = (a - Math.floor(a)) * 1000;
//        System.out.println("function = " + Math.round(ddd));
//
//        double nnn = Math.floor(a) / 1000;
//        System.out.println("function = " + nnn);
//
//        double result = ddd + nnn;
//
//        System.out.printf( "%.3f", result );
//    }



    // №1.5
//
//
//    public static void main(String[] args) {
//
//        function (3824);
//    }
//    private static void function (int x) {
//        int hours, minuts, seconds;
//        hours = x / 3600;
//        minuts = (x - (hours * 3600))/60;
//        seconds = x - (hours * 3600) - (minuts * 60);
//        System.out.println(hours + "ч " + minuts + "мин " + seconds + "сек");
//    }



    // №1.6
//
//
//    public static void main(String[] args) {
//
//    function (8,3);
//    }
//    private static void function (double x, double y) {
//        if ((x < 4 & x > -4)&(y < 4 & y > -3)) System.out.println("true");
//        else System.out.println("false");
//    }


// №2.1
//
//
//    public static void main(String[] args) {
//
//        function (90,89);
//    }
//    private static void function (int x, int y) {
//        if ((x + y) > 1 & (x + y) < 180) System.out.println("треугольник существует");
//        if ((x + y == 90) | (x == 90 & y < 90) | (y == 90 & x < 90)) System.out.println("прямоугольный");
//    }


//  №2.2


//    public static void main(String[] args) {
//
//    int a = functionMin (90,34);
//    int b = functionMin (17,109);
//
//    int c = functionMax (a, b);
//    System.out.println(c);
//    }
//
//    static int functionMin (int x, int y) {
//        if (x > y) return y;
//        else return x;
//    }
//
//    static int functionMax (int x, int y) {
//        if (x > y) return x;
//        else return y;
//    }


    //  №2.3
//
//
//    public static void main(String[] args) {
//        function (1,2, 3, 1, 2, 3);
//    }
//
//    private static void function (int x, int x1, int x2, int y, int y1, int y2) {
//        if (((x - x1) / (x2 - x1)) - ((y - y1) / (y2 - y1)) == 0) {
//            System.out.println("points are on one line");
//        }
//    }


    // Ветвления №2.4
//
//
//    public static void main(String[] args) {
//
//    myFunction (10,10, 10, 23, 10);
//    }
//    private static void myFunction (int A, int B, int x, int y, int z) {
//        if (((x <= A) & (y <= B)) || ((x <= B) & (y <= A)) || ((x <= A) & (z <= B))
//                || ((x <= B) & (z <= A)) || ((y <= A) & (z <= B)) ||
//                ((y <= B) & (z <= A))) {
//            System.out.println("ok");
//        }
//    }


    //  №2.5
//
//
//    public static void main(String[] args) {
//
//    myFunction ( 4);
//    }
//    private static void myFunction (int x) {
//        if (x <= 3) System.out.println("result = " + (Math.pow(x,2) - 3 * x + 9));
//        else if (x > 3) System.out.println("result = " + (1 / (Math.pow(x,3) + 6)));
//    }


    // №3.1
//
//
//    public static void main(String[] args) {
//
//    Scanner in = new Scanner(System.in);
//    int number = in.nextInt();
//    int sum = 0;
//
//    for (; number > 0; number = number - 1)
//        sum += number;
//        System.out.println("result = " + sum);
//    }


    // №2.2
//
//
//
//    public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    System.out.println("Enter а ");
//    int a = in.nextInt();
//    System.out.println("Enter b ");
//    int b = in.nextInt();
//    System.out.println("Enter h ");
//    int h = in.nextInt();
//    int x, y;
//
//    for (; a < b; a = a + h) {
//        x = a;
//        if (x > 2) {
//            y = x;
//            System.out.println("y = " + y);
//        } else if (x <= 2) {
//            y = -x;
//            System.out.println("y = " + y);
//           }
//        }
//    }



    //  №3.3
//
//
//    public static void main(String[] args) {
//
//    double x = 0;
//    double y = 0;
//    do {
//        y = y + Math.pow(x,2);
//        x = x +1;
//    }
//    while (x <= 100);
//    System.out.println("sum = " + y);
//    }


    //   №3.4
//
//    public static void main(String[] args) {
//
//    double x = 1;
//    double y = 1;
//        do {
//        y = y * Math.pow(x,2);
//        x = x + 1;
//        }
//    while (x <= 200);
//
//    System.out.println("sum = " + y);
//    }


    // №3.5
//
//    public static void main(String[] args) {
//
//    Scanner in = new Scanner(System.in);
//    System.out.println("Enter n ");
//    double n = in.nextInt();
//    System.out.println("Enter e ");
//    int e = in.nextInt();
//    double a, y = 0;
//
//    for (; n < 10; n++) {
//        a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
//        if (a >= e & a >= 0) {
//        y = y + a;
//        }
//        else if (a < 0 & -a >= e){
//            y = y + (-1) * a;
//        }
//    }
//    System.out.println("y = " + y);
//    }


// №3.6
//
//
//    public static void main(String[] args) {
//
//    for (int k = 0; k <= 255; k++){
//        char l = (char)k;
//        System.out.println(k + " = " + l);
//    }
//    }


// №3.7
//
//
//public static void main(String[] args) {
//
//    Scanner in = new Scanner(System.in);
//    System.out.println("Enter m ");
//    int m = in.nextInt();
//    System.out.println("Enter n ");
//    int n = in.nextInt();
//
//    for (; m < n; m++) {
//        for(int i = 2; m > i; i++) {
//            if (m % i == 0) System.out.println("For number " + m + " exist " + i);
//        }
//    }
//}


// №3.8
//
//
//    public static void main(String[] args) {
//
//    Scanner in = new Scanner(System.in);
//    System.out.println("Enter m ");
//    int m = in.nextInt();
//    System.out.println("Enter n ");
//    int n = in.nextInt();
//
//    do {
//        System.out.println("First number consist of " + (m % 10));
//        m = (m - (m % 10))/ 10;
//    }
//    while (m != 0);
//
//    do {
//        System.out.println("Second number consist of " + (n % 10));
//        n = (n - (n % 10))/ 10;
//    }
//    while (n != 0);
//}


}