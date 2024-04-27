public class BmiService {

    public int index (int weight, int high) {
        int result;
        float truehigh = (float) high * high / 10000;
        result = (int) (weight / truehigh);
        return result;

    }
}


