package paquete;


import java.util.Date;


/**
 * @autor Marlon
 */
public class Person {
      //Creacion de atributos

        public String name;
        public String lastName1;
        public String lastName2;
        public Date dateBirth;
        public Float height;

    /**
     * Constructor
     * @param name
     * @param lastName1
     * @param lastName2
     * @param dateBirth
     * @param height
     */

     public Person(String name, String lastName1, String lastName2, Date dateBirth, Float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     *
     * @return retorna in string con nombre
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}


