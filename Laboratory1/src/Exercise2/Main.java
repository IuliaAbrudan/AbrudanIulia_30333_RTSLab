package Exercise2;
public class Main {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 1}, {7, 1, 6}, {9, 2, 4}};
        int[][] b = {{8, 5, 3}, {3, 9, 2}, {2, 7, 3}};

        int[][] sum = sum(a, b);
        int[][] product = multiply(a, b);

        System.out.println("Sum of the matrices:");
        print(sum);

        System.out.println("\nProduct of the matrices:");
        print(product);
    }

    public static int[][] sum(int[][] a, int[][] b) {
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[3][3];

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void print(int[][] a) {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}