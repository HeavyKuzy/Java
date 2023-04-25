public class Human {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "Petr";
        human1.SecName = "Petrov";
        human1.year_of_b = 2003;

        human1.GetYear();
    }

    public  String name;
    public String SecName;
    public int year_of_b;

    public void GetYear( ) {
        int CurrentYear = 2023;
        System.out.println(SecName);
        System.out.println(name);
        int age = CurrentYear - year_of_b;
        System.out.println(age);
    }
}
