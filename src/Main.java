public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("ИМТ: " + service.index(98, 1.87));
    }
}