package day14;

public class Demo04Main {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();

        if (animal instanceof Cat){
            Cat cat=(Cat) animal;
            cat.hobby();

        }

    }
}
