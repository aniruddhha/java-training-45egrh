public class MethodDemo {

    private void calcUsages() {
        // accessible within class only
    }

    protected  void calcMemory() {
        // accessible in class and child classes
    }

    public void calcDisk() {
        // accessible everywhere
    }

    public int addNumbers(int n1, int n2) {
        n1 = 100;
        return n1 + n2;

//        return 12.f;
    }

    void showResult() {
        int n1 = 10;
        int res = addNumbers(n1, 23);
        System.out.println("Result is " + res);

        int[] arr1 = {1, 2, 3};
        printArray(arr1);

        float[] arr2 = { 12.6f, 34.f, 45.2f  };
        printArray(arr2);
    }

    void printArray(int[] arr) {
        arr[0] = 1;
    }

    void printArray(float[] arr) {

    }

    static void callNumber(String num) {
        System.out.println("Calling Num " + num);
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        md.addNumbers(1, 90);

        MethodDemo.callNumber("1234");

    }
}
