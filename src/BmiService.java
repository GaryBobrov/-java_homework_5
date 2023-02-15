public class BmiService {

    public int calculate(double height, double weight) {
        double result = height * height;
        double index = weight / result;
        return (int) index;
    }
}
