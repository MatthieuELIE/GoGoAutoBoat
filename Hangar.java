/**
 * Hangar
 */
public class Hangar {

    public static void main(String[] args) {

        Car suzuki = new Car("Suzuki");
        Boat zodiac = new Boat("Zodiac");

        System.out.println(suzuki.doStuff());
        System.out.println(zodiac.doStuff());

    }

}
