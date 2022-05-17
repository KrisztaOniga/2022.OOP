package oop.labor12.lab12_1.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetDictionary implements IDictionary{

    private final Set<String> words = new HashSet<>();
    private static HashSetDictionary instance;

    private HashSetDictionary() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(DICTIONARY_FILE));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not foud : " + DICTIONARY_FILE);
            System.exit(1);
        }
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();
            words.add(row);
        }
    }

    public static IDictionary newInstance() {
        return new HashSetDictionary();
    }

    @Override
    public boolean add(String word) {
        for( String item:words){
            if(!item.equals(word)){
                words.add(word);
            }
        }
        return false;
    }


    @Override
    public boolean find(String word){
        return words.contains(word);
    }

    @Override
    public int size() {
        return words.size();
    }
}
