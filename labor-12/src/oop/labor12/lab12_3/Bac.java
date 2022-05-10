package oop.labor12.lab12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

enum SUBJECT {
    ROMANIAN("roman.txt"),
    HUNGARIAN("magyar.txt"),
    MATH("matek.txt");
    private String name;

    SUBJECT(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
};

public class Bac {

    private Map<Integer, Student> map = new HashMap<>();

    //konstruktor
    public Bac() {
        readNames("nevek1.txt");
        for (SUBJECT subject : SUBJECT.values()) {
            readMarks(subject);
        }
    }

    public void readNames(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);
                Student student = new Student(id, items[1].trim(), items[2].trim());
                map.put(id, student);
            }
            System.out.println(map.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readMarks(SUBJECT subject) {
        try (Scanner scanner = new Scanner(new File(subject.getName()))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String items[] = line.split(" ");
                int id = Integer.parseInt(items[0]);

                Student student = this.map.get(id);

                if (student == null) { //ha nincs ilyen id-val rendelkezo diak
                    continue;
                }

                switch (subject) {
                    case MATH ->
                        student.setMatek(Double.parseDouble(items[1]));
                    case ROMANIAN ->
                        student.setRoman(Double.parseDouble(items[1]));
                    case HUNGARIAN ->
                        student.setMagyar(Double.parseDouble(items[1]));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int getNumPassed(){
        int count = 0;
        for(Student student: map.values()){
            student.computeAverage();
            if(student.getAverage() > 0){
                ++count;
            }
        }
        return count;
    }


}
