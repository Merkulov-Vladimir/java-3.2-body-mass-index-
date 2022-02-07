public class Main {
    public static void main(String[] args) {
        double h = 172; // рост в см
        double m = 74; // вес в кг
        BmiService service = new BmiService();
        double bmi = service.calculate(h, m);
        System.out.println("Индекс массы тела равен " + bmi + " кг/м²");
    }
}
