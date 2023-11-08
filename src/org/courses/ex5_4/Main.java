package org.courses.ex5_4;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat cat = new Cat("Wanda", "Scotland", 13);
        System.out.println("Before changes: " + cat.toString());
        cat.changeFields();
        System.out.println("After changes:  " + cat.toString());
    }

}
