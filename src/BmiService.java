public class BmiService {
    public double calculate(double h, double m) {
        return m / (h * h) * 10000;
        // Индекс массы тела измеряется в кг/м² и рассчитывается по формуле: ИМТ = m/h2, где:
        // m — масса тела в килограммах,
        //h — рост в метрах.
    }
}
