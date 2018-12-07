
public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 1;
        int c = 0;

        System.out.println("Fabonacci Sequence:");
        while (a > 0) {
            b = b + c;
            c = b - c;
            a--;
            System.out.print(b+" ");
        }

        int d = 10;
        int e = 1;

        System.out.println("\nPerfect Squares:");
        while (d>0) {
            int f = (int)Math.pow(e,2);
            System.out.print(f+" ");
            d--;
            e++;
        }

        int f = 10;
        int g = 1;

        System.out.println("\nPerfect Cubes:");
        while (f>0) {
            int h = (int)Math.pow(g,3);
            System.out.print(h+" ");
            f--;
            g++;
        }

        System.out.println("\nPrime Numbers:");

        int x=10;
        int num = 2;
        while (x>0) {
            boolean flag = false;

            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                x--;
                System.out.print(num+" ");
            }
            num++;
        }

        System.out.println("\nTriangle Numbers:");
        a= 0;
        b = 0;
        int w= 0;
        while (b!=55){
            a++;
            b = a +w;
            w=b;
            System.out.print(b+" ");
        }
    }
}
