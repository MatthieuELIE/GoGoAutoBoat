/**
 * Vehicule
 */
public abstract class Vehicule {

    // Attributes
    private String brand;
    private Integer kilometers;

    // Constructors
    public Vehicule(String brand) {
        this.brand = brand;
        this.kilometers = 0;
    }

    public Vehicule(String brand, Integer kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // Methods
    public abstract String doStuff();

    // Getters
    public String getBrand() {
        return this.brand;
    }

    public Integer getKilometers() {
        return this.kilometers;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

}
