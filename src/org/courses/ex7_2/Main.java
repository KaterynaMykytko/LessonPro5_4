package org.courses.ex7_2;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        Path path = Paths.get("/Users/sergey.mikitko/Documents/" +
                "LessonPro7_2/src/org/courses/ex7_2/file.txt");

        Cat cat = new Cat("Wanda", "Scotland", 13);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path.toFile()));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path.toFile()));
            oos.writeObject(cat);
            oos.flush();

            Cat cat1 = (Cat) ois.readObject();
            System.out.println(cat1);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        //System.out.println("Before changes: " + cat.toString());
        //cat.changeFields();
        //System.out.println("After changes:  " + cat.toString());
    }

}
