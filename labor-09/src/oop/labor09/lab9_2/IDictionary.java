package oop.labor09.lab9_2;

public interface IDictionary {

    final String DICTIONARY_FILE = "dictionary.txt";
    boolean add(String word);
    boolean find(String word);
    int size();
}
