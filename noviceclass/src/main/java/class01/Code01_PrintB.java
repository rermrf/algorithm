package class01;

public class Code01_PrintB {

    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int 32位二进制
        int num = 1;
        print(num);

        int n = 1;
        print(n << 1);
        print(n << 2);

        System.out.println(Integer.MAX_VALUE);
        print(Integer.MAX_VALUE);
        print(Integer.MIN_VALUE);

        int a = 1234567889;
        int b = ~a;
        print(a);
        print(b);
    }
}
