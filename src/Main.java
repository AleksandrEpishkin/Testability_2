public class Main {
    public static void main(String[] args) {

        BodyMassIndexService service = new BodyMassIndexService();

        double bmi = service.calculate(90, 1.75);
        System.out.println("Индекс массы тела: " + bmi);
    }
}