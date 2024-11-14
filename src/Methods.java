public class Methods {

    public static int addNumbers(int n1, int n2) {
        n1 = 300;

        return n1 + n2;
    }

    public static void copyArr(int[] arr) {
        arr[0] = 90;
    }

    public void mkDir(String path) {

    }

    public void mkDir(int path) {

    }

    public static void renameFile(String path) {

    }

    public static void main(String[] args) {
        int sum = addNumbers(19,56);

        int n1 = 10;
        int n2 = 30;

        addNumbers(n1, n2);

        int[] arr1 = { 1, 2, 4 };
        copyArr(arr1);

        Methods m = new Methods();
        m.mkDir(1); // with the help of object : Instance methods

        Methods.renameFile("abc"); // with the help of class name itself : class methods

    }
}
