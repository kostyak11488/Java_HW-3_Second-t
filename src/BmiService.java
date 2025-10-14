public class BmiService {
    public double calculate(double weit, double heit) {
        double result = weit / (heit * heit);
        return result;
    }

}
