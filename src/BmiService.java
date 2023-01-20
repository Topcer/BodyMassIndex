public class BmiService {
    public double calculate(double height, double weight) {
        double BMI = weight / (height * height);
        return BMI;
    }
}