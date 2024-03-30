public class BmiService {

    public int index(int mass_kg , double height_meters) {
        int result;
        result = (int) (mass_kg / (height_meters * height_meters));
        return result;
    }

}
