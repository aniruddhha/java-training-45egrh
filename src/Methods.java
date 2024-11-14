public class Methods {

    public static int addNumbers(int n1, int n2) {
        n1 = 300;

        return n1 + n2;
    }

    public static void copyArr(int[] arr) {
        arr[0] = 90;
    }

    public static void main(String[] args) {
        int sum = addNumbers(19,56);

        int n1 = 10;
        int n2 = 30;

        addNumbers(n1, n2);

        int[] arr1 = { 1, 2, 4 };
        copyArr(arr1);
    }
}
