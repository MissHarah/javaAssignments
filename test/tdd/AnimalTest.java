package tdd;

import chapterTwo.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("hairy", "plenty", "Female");

        System.out.println(animal.getTails());
        System.out.println(animal.getFurs());
        System.out.println(animal.getGender());
    }

}