package oop.labor09.lab9_2;

import java.util.ArrayList;

public class DictionaryService {

    private IDictionary dictionary;

    public DictionaryService(DictionaryType dictionaryType) {
        this.dictionary = DictionaryProvider.createDictionary(dictionaryType);
    }

    public boolean findWord(String word) {
        return dictionary.find(word);
    }

    public ArrayList<String> findWordsFile(String fileNev){
        ArrayList <String> result = new ArrayList<>();
        return result;
    }
}
