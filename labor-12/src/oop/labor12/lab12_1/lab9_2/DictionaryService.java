package oop.labor12.lab12_1.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {

    private IDictionary dictionary;

    public DictionaryService(DictionaryType dictionaryType) {
        this.dictionary = DictionaryProvider.createDictionary(dictionaryType);
    }

    public boolean findWord(String word) {
        return dictionary.find(word);
    }

    public static ArrayList<String> readwords(String filename) {
        ArrayList<String> words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return words;
    }

    public ArrayList<String> findWordsFile(String fileNev){
        ArrayList <String> result = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileNev))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if(!findWord(line)){
                    result.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
