package homework;

public class Animal {

    /**
     * attributes
     */
    public String name;
    public int age;
    private String gender;
    protected String breed;

    /**
     * Constructor
     * @param gender
     * @param breed
     */
    public Animal(String gender, String breed) {
        this.gender = gender;
        this.breed = breed;
    }

    /**
     *
     * @return returns information from get-set
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
