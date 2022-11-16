public class Main {
    public static void main(String[] args) {

        byte one = 127;
        short two = 259;
        int three = 56;
        long four = 43L;
        double five = 0.56;
        float six = 23.56f;

        boolean yes = false;
        int b = 3000;

        while (!yes) {
            if (one > two || three != one >> 2) {
                int a = 10 + 20 >> 4;
                b = a;
                System.out.println("QA Guru" + b);
                System.out.println(b + "QA Guru");
                break;

            } else if (four == six) {
                int a = 9999 + 9999;
                b = a;
                System.out.println(b + "It`s false");
                System.out.println("It`s false" + b);
                break;
            }


        }

        int[] x = new int[10];

        for (int i = 0; i < x.length; i++) {
            for (int j = i; j < i + 1; j++) {
                x[i] = i + i;
                System.out.println(x[i]);
            }
        }


        System.out.println((byte) (one + 5));
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a + 2);


    }
}
