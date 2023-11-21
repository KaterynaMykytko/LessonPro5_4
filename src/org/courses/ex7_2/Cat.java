package org.courses.ex7_2;

import java.io.Serializable;
import java.lang.reflect.Field;

public class Cat extends Animal implements Serializable {

    public Cat(String name, String breed, int age) {
        super(name, breed, age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' + "," +
                "age='" + super.getAge() +
                '}';
    }

    public void changeFields() {
        try {
            Class superClass = this.getClass().getSuperclass();

            Field nameField = superClass.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(this, "NEW NAME");

            Field breedField = superClass.getDeclaredField("breed");
            breedField.setAccessible(true);
            breedField.set(this, "NEW BREED");

            Field ageField = superClass.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(this, 10);
        } catch (Exception e) {
            throw new RuntimeException("Exception while changing fields by reflection", e);
        }
    }

}






