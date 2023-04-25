import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {
        RightTriangle first = new RightTriangle();
        first.Get_Cathet();
        first.find_hypotenuse();
    }

    public double  hypotenuse;
    public double  cathet1;
    public double  cathet2;

    public  void find_hypotenuse(){
         hypotenuse =  Math.sqrt((cathet1*cathet1) + (cathet2 * cathet2));
         System.out.println(hypotenuse);
    }

    public void Get_Cathet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("cathet1: ");
        cathet1 = sc.nextInt();
        System.out.println("cathet2: ");
        cathet2 = sc.nextInt();

    }

}
