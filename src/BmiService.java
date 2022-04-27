public class BmiService {

    public double calculate (double m, double h) {

        double bmi = m / (h * h);

        return (double) bmi;
    }
}
