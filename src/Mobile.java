//int a = 20;
//int b = 30;
//int c = a + b;

public class Mobile {

    static void addition() {
        int a = 20;
        int b = 30;
        int c = a + b;

        System.out.println("Addition is " + c );
    }

    static void ifElseDemo() {
        int day = 3;

        if(day == 1) {
            System.out.println("Mon");
        } else if(day == 2) {
            System.out.println("Tue");
        } else if(day == 3) {
            System.out.println("Wed");
        } else {
            System.out.println("Invalid Day");
        }
    }

    static void nestedIfElse() {
        int marks = 60;

        if(marks >= 40) {

            if(marks > 40 && marks <= 50) {
                System.out.println("Third Class");
            }
            if(marks > 50 && marks <=70) {
                System.out.println("Second Class");
            }
            if(marks > 70 && marks <= 90) {
                System.out.println("First Class");
            }
            if(marks > 90 && marks <= 100) {
                System.out.println("Distinction");
            }
        } else {
            System.out.println("Fail");
        }
    }

    static void switchCaseDemo() {

        int day = 3;

        switch (day) {
            case 1: {
                System.out.println("Mon");
                break;
            }
            case 2: {
                System.out.println("Tue");
                break;
            }
            case 3: {
                System.out.println("Wed");
                break;
            }
            default: {
                System.out.println("Invalid Day");
            }
        }

    }

    static void forLoopDemo() {

        for (int i = 0; i < 10; i++) {
            System.out.println("I = "+ i);
        }
    }

    static void whileLoopDemo() {

        int i = 10;
        while( i >= 0) {
            i--;
            System.out.println("I = "+i);
        }
    }

    static void doWhileLoop() {
        int i = 10;

        do {
            i--;
            System.out.println("I = "+i);
        }
        while( i >= 0);
    }

    static void forEachDemo() {
       int[] arr = { 1, 2, 3, 4, 5 };

       for (int i : arr) {
           System.out.println("I = " + i );
       }
    }

    static int calc() {
        return 10;
    }

    static void nestedLoops() {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }
    }

    static void continueExample() {
        for (int i = 0; i < 100; i++) {
            if( i%2 == 0) continue;
            if( i%2 != 0) break;
        }
    }

    static void ternaryDemo() {
        int i = 100;
        String res = i > 100 ? "PASS" : "FAIL";
    }
    static void infiniteLoopDemo() {
        while(true) {

        }
    }

    static void rec() {
//        rec();
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        forLoopDemo();
    }
}
