package homework;

public class Computer {

    /**
     * @autor Marlon
     */
    public String manufacture;
    public int size;
    public float memory;
    private String operatingSystem;

    /**
     * constructor
     * @param manufacture
     * @param size
     * @param memory
     * @param operatingSystem
     */

    public Computer(String manufacture, int size, float memory, String operatingSystem) {
        this.manufacture = manufacture;
        this.size = size;
        this.memory = memory;
        this.operatingSystem = operatingSystem;
    }

    /**
     *
     * @return returns information from get-set
     */

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
