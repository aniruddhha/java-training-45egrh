package morning;//void hi() {
//
//}
//
//int d = 90;

public class Main {

    public static void main(String[] args) {
        forDemo();
    }
    public void add() {
        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("Addition is "+ c);
    }

    static void ifDemo() {
        int day = 1;

        if(day == 0) {
            System.out.println("Mon");
        }
        if(day == 1) {
            System.out.println("Tue");
        }
    }

    static void ifElseDemo() {
        boolean isVisited = false;

        if(isVisited) {
            System.out.println("Memory Visited");
        } else {
            System.out.println("Memory Not Visited");
        }
    }

    static void idElseLadder() {
        int marks = 60;

        if(marks >= 40) {
            System.out.println("Pass");

            if(marks > 40 && marks< 50) {
                System.out.println("Second Class");
            }
         } else if(marks >= 50 && marks<60) {
            System.out.println("Second Class");
        }
    }

    static void switchCase() {
        int day = 2;

        switch (day) {

            case 1: {
                System.out.println("Mon");
                break;
            }
            case 2: {
                System.out.println("Tue");
                break;
            }
            default:{
                System.out.println("Invalid Day");
            }
        }
    }

    static void forDemo() {
        for(int i = 0; i < 10; i++) {
            System.out.println("I = " + i);
        }
    }

    static void forEachDemo() {
        int[] arr = { 1, 2, 3, 4 };

        for (int i : arr) {
            System.out.println("I = " + i);
        }
    }

    static void whileDemo() {
        int i = 10;

        while(i >= 1) {
            i--;
            System.out.println("I " + i);
        }
    }

    static void doWhileDemo() {
        int i = 10;

        do {
            System.out.println("i = "+ i);
            i++;
        } while(i >= 1);
    }

    static void branchingDemo() {
        for (int i = 0; i <100; i++) {
            if(i % 2 == 0) {
                continue;
            }
            else {
                break;
            }
        }
    }

    static int calc() {
        return  10;
    }

    static void nestedLoops() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

            }
        }
    }

    static void ternaryOperator() {

        int i = 10;

        String res = i >= 0 ? "Simple" : "complex";
        System.out.println("Result is "+ res);
    }
}