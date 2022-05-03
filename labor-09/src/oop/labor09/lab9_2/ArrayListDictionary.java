package oop.labor09.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{

    private final ArrayList<String> words = new ArrayList<>();
    private static ArrayListDictionary instance;

    ArrayListDictionary() {
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
        return new ArrayListDictionary();
    }

    @Override
    public int size(){
        return words.size();
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
        return Collections.binarySearch(words, word) >= 0;
        //Collections.binarySearch(miben, mit)-rendezett kell legyen;
    }
}
