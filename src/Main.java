public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        double x = cal.Add(2.6,3.4);
        System.out.println("Addition = " + x);

        x = cal.Sub(8.5,2);
        System.out.println("Subtration = " + x);

        x = cal.Multi(3,6);
        System.out.println("Multiplication = " + x);

        x = cal.Div(20, 2);
        System.out.println("Division = " + x);
    }
}