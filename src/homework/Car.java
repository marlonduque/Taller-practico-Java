package paquete;

public class Car {


    /**
     * @autor Marlon
     */
    public int numberTires;
    public String color;
    private String engine;
    public float price;
    protected String key;

    public Car(int numberTires, String color, String engine, float price, String key) {
        this.numberTires = numberTires;
        this.color = color;
        this.engine = engine;
        this.price = price;
        this.key = key;
    }

    /**
     * Constructor vacio
     */
    public Car() {
    }

    /**
     *
     * @return retorna
     */
    public int getNumberTires() {
        return numberTires;
    }

    public void setNumberTires(int numberTires) {
        this.numberTires = numberTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
