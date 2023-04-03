package homeworkfive;

public class Test {

    public static void main(String[] args) {

        Cat persian = new Cat("persian","female",6.7, (byte) 3,true);
        persian.sleep();
        persian.eat();
        Cat angora = new Cat("angora","male",5.3,(byte) 5,false);
        angora.sleep();
        Cat street = new Cat("street","male",3.2,(byte) 10,true);
        street.eat();

    }

}
