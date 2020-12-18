public class Base01 {
    public static int X_EQUALS;
    public static int Y_EQUALS;
    public static int A_EQUALS;
    public static int B_EQUALS;
    public static int C_EQUALS;

    public static int subtraction(int x, int y) {
        X_EQUALS = x;
        Y_EQUALS = y;
        System.out.println("Вызвана функция subtraction() с параметрами x = " + X_EQUALS + ", y = " + Y_EQUALS);
        return x - y;
    }
    public static int addition(int x, int y) {
        X_EQUALS = x;
        Y_EQUALS = y;
        System.out.println("Вызвана функция addition() с параметрами x = " + X_EQUALS + ", y = " + Y_EQUALS);
        return x + y;
    }
    public static int multiplication(int x, int y) {
        X_EQUALS = x;
        Y_EQUALS = y;
        System.out.println("Вызвана функция multiplication() с параметрами x = " + X_EQUALS + ", y = " + Y_EQUALS);
        return x * y;
    }

    public static void calculation() {
        int a = 34;
        A_EQUALS = a;
        int b = 55;
        B_EQUALS = b;
        int c;
        System.out.println("a = " + A_EQUALS);
        System.out.println("b = " + B_EQUALS);
        c = addition(a, b);
        System.out.println("a + b = " + c);
        c = subtraction(a, b);
        System.out.println("a - b = " + c);
        c = multiplication(a, b);
        System.out.println("a * b = " + c);
    }
    public static void calculation(int a, int b, int c) {
        A_EQUALS = a;
        B_EQUALS = b;
        C_EQUALS = c;
        System.out.println("Вызвана функция calculation() с параметрами a = " + A_EQUALS + ", b = " + B_EQUALS + ", c = " + C_EQUALS);
        int temp = addition(a, b);
        temp = addition(temp, c);
        System.out.println("a + b + c = " + temp);
        temp = multiplication(a, a);
        temp = multiplication(temp, a);
        System.out.println("a^3 = " + temp);
        temp = multiplication(c, c);
        temp = addition(b, temp);
        temp = subtraction(a, temp);
        System.out.println("a - (b + c^2) = " + temp);
    }

    public static void main(String[] args) {
//        System.out.println(subtraction(45, 12));
        subtraction(45, 12);
        subtraction(23, 55);
//        System.out.println(addition(128, 787));
        addition(128, 787);
        addition(528,387);
//        System.out.println(multiplication(124, 87));
        multiplication(124, 87);
        multiplication(1528,3);
        calculation();
        calculation(11, 25, 410);
        calculation(100, 9, 98);

            }
}


//    public double toDouble(String str) {
//        return Double.parseDouble(str);
//    }
//    public int maxInt() {
//        return Integer.MAX_VALUE;
//    }
//    public int toInt(String str) {
//        return Integer.parseInt(str);
//    }