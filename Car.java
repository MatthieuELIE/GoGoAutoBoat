/**
 * Car
 */
public class Car extends Vehicule {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis une " + this.getBrand() + " et je fais vroom vroom !";
    }
}
