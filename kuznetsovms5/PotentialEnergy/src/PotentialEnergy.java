import java.util.Scanner;

public class PotentialEnergy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("h = ");
        h = sc.nextInt();
        System.out.println("m = ");
        m = sc.nextInt();
        countE();

    }

    static final float g = 9.8f;
    static float h;
    static float m;

    static float E;

    public float GetG(){
        return g;
    }

    public float GetH(){
        return h;
    }

    public float GetM(){
        return m;
    }

    public static void setH(float newH){
        h = newH;
    }

    public static void setM(float newM){
        m = newM;
    }

    public static float countE(){
        System.out.println(E = m*g*h);
        return E = m*g*h;
    }

}
