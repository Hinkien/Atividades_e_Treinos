package testeste;

import java.util.Scanner;

public class bhaskara {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        int a, b, c;
        double delta, x1, x2;
        a = numero.nextInt();
        b = numero.nextInt();
        c = numero.nextInt();

        delta = (b * b) + (-4 * a * c);
        System.out.println("O valor de Delta é: " + delta);

        if (delta >= 0){
            x1 = ((-(b) + Math.sqrt(delta))/ 2 * a);
            x2 = ((-(b) - Math.sqrt(delta))/ 2 * a);

            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        } else {
            System.out.println("Delta não possui raiz!");
        }

    }

}
