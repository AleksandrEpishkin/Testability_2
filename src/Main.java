public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        double bmi = service.calculate(80, 1.75);
        System.out.println("Индекс массы тела: " + bmi);
    }
}