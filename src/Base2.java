public class Base2 {
    public static int subtraction(int x, int y) {
        final String X_EQUALS = "x = ";
        final String Y_EQUALS = "y = ";
        System.out.println("Вызвана функция subtraction() с параметрами " + X_EQUALS + x + " , " + Y_EQUALS + y);
        int sum = x-y;
        System.out.println("x - y = " + sum);
        return x - y;
    }
    public static int addition(int x, int y) {
        final String X_EQUALS = "x = ";
        final String Y_EQUALS = "y = ";
        System.out.println("Вызвана функция addition() с параметрами " + X_EQUALS + x + " , " + Y_EQUALS + y);
        int sum = x + y;
        System.out.println("x + y = " + sum);
        return x + y;
    }
    public static int multiplication(int x, int y) {
        final String X_EQUALS = "x = ";
        final String Y_EQUALS = "y = ";
        System.out.println("Вызвана функция multiplication() с параметрами " + X_EQUALS + x + " , " + Y_EQUALS + y);
        int mult = x * y;
        System.out.println("x * y = " + mult);
        return x * y;
    }
    public static void calculation() {
        int a = 34;
        int b = 55;
        final String A_EQUALS = "a = ";
        final String B_EQUALS = "b = ";
        System.out.println(A_EQUALS + a);
        System.out.println(B_EQUALS +b);
        int c = addition (a, b);
        System.out.println("a + b = " + c);
        int c1 = subtraction(a, b);
        System.out.println("a - b = " + c1);
        int c2 = multiplication(a, b);
        System.out.println("a * b = " + c2);
    }
    public static void calculation(int a, int b, int c) {
        final String A_EQUALS = "a = ";
        final String B_EQUALS = "b = ";
        final String C_EQUALS = "c = ";
        System.out.println("Вызвана функция calculation() с параметрами " + A_EQUALS + a + " , " + B_EQUALS + b + " , "+ C_EQUALS + c);
        int result = a + b + c;
        System.out.println("a + b + c = " + result);
        int func = a*a*a;
        System.out.println("a^3 = " + func);
        int exampl = (a - (b + c*c));
        System.out.println("a - (b + c^2) = " + exampl);
    }
    public static void main(String[] args) {
        subtraction(45, 12);
        subtraction(23,55);
        addition(128, 787);
        addition(528, 387);
        multiplication(124, 87);
        multiplication(1528, 3);
        calculation();
        calculation(11,25,410);
        calculation(100,9,98);
    }
}




