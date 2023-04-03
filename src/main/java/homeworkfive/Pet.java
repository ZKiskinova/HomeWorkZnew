package homeworkfive;

public class Pet {

    /// instance variable
    private String breed;
    private String sex;
    private double weight;
    private byte age;

    ////// get&set
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty()) {
            this.breed = breed;
        } else {
            System.out.println("Error: Please fill up that field!");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (!sex.isEmpty()) {
            this.sex = sex;
        } else {
            System.out.println("Error: Please fill up that field!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Incorrect weight");
        }
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Error: Incorrect age");
        }
    }
    // constructor
    public Pet( String breed, String sex, double weight, byte age){
        setBreed(breed);
        setAge(age);
        setSex(sex);
        setWeight(weight);

    }
     /// actions
    public void sleep(){
        System.out.println(this.breed + " cats are sleeping.");
    }
    public void eat(){
        System.out.println(this.breed + " cats are eating only granules");
    }
}


