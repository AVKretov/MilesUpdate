public class BonusMilesService {
    public static int calculate(int price) {

        int milesPerRuble = 20;

        return price / milesPerRuble;
    }
}
