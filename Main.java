public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90; // Масса тела в килограммах
        int high = 190; // Масса тела в сантиметрах
        int bmi = service.index(weight, high);
        System.out.println(bmi);
    }
}