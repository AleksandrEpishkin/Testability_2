public class BodyMassIndexService {

    public double calculate(double mass, double height) {

        double bmi = mass / Math.pow(height, 2);
        bmi = Math.round(bmi * 100.0) / 100.0;


        return (double) bmi;
    }
}
