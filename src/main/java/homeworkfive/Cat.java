package homeworkfive;

public class Cat extends Pet {

    private boolean hasNails;

    public boolean isHasNails() {
        return hasNails;
    }

    public void setHasNails(boolean hasNails) {
        this.hasNails = hasNails;
    }

    public Cat(String breed, String sex, double weight, byte age, boolean hasNails) {
        super(breed, sex, weight, age);
        setHasNails(hasNails);
    }

    public void sleep(){
        System.out.println(super.getBreed() + " cats are sleeping.");
    }
}




