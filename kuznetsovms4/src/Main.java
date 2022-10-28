import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        DuplicatesDelete();


    }

    //1
    public static void square() {
        Scanner sci = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sci.nextInt();
        System.out.println("Введите второе число: ");
        int b = sci.nextInt();
        System.out.println("сумма квадратов двух чисел: " + (a * a + b * b));
    }


    //2
    public static void degree() {
        Scanner sci = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = sci.nextInt();
        System.out.printf("Введите степень: ");
        int b = sci.nextInt();
        int c = a;
        for (int i = 1; i < b; i++) {
            c *= c;

        }
        System.out.println(a + "^" + b + " = " + c);
    }


    //3
    public static void ChetNechet() {
        Scanner sci = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int a = sci.nextInt();
        if (a % 2 == 0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }


    //4
    public static void evenDelete() {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int i = 0; i < array.length; i++) {
          if (array[i] % 2 == 0) array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }



    //5
    public static void DuplicatesDelete() {
        Scanner sci = new Scanner(System.in);
        int[] array = new int[]{1, 2, 1, 4, 1, 6, 1, 8, 1};
        System.out.println("Введите число для удаления: ");
        int a = sci.nextInt();

        for (int i = 0; i < 9; i++){
            if (array[i] == a) array[i] = 0;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}