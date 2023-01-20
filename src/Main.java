public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;   // Рост в метрах
        double weight = 60;     // Вес в киллограммах
        double BMI = service.calculate(height, weight);
        String result = String.format("%.2f", BMI); // Округление до 2 знака, после запятой
        System.out.println("Индекс массы тела = " + result);
    }
}