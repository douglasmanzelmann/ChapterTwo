/**
 * Created by dmanzelmann on 10/28/14.
 */
public class MainUOA {
    public static void main(String[] args) {
        UOA<PhoneListing> NYC = new UOA<PhoneListing>(500);
        PhoneListing bob = new PhoneListing("Bob", "23 1st Avenue", "133-4573");
        PhoneListing roy = new PhoneListing("Roy", "421 east 24th street", "897-2232");

        NYC.insert(bob);
        NYC.insert(roy);
        System.out.println(NYC.fetch("Roy").toString());
        System.out.println(NYC.fetch("Bob").toString());

    }
}
