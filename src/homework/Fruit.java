package homework;

import java.util.ArrayList;

/**
 * @autor Marlon
 */
public class Fruit {
    public String name;
    private Float averageWeight;
    public ArrayList <String> colors;

    /**
     * Constructor
     * @param name
     * @param averageWeight
     * @param colors
     */

    public Fruit(String name, Float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     *
     * @return Retorna lista de colores
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}

