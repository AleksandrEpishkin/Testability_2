public class BodyMassIndexService {

    public double calculate(double m, double h) {

        double bmi = m / Math.pow(h, 2);
        bmi = Math.round(bmi * 100.0) / 100.0;


        return (double) bmi;
    }
}
