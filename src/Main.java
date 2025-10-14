public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 92;
        double Bmi = service.calculate(weight, height);
        int intBmi = (int) Bmi;
        System.out.println(intBmi);
    }
}
