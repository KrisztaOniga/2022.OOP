package oop.labor11.eloadas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramma {
    private Map<String, ArrayList<String>> osztalyok = new HashMap<>();

    private String[] szavak = {"kep", "utas", "pek", "tusa", "dak", "kad", "suta"};

    public Anagramma() {
        for (String szo : szavak) {
            String cimke = cimkez(szo);
            ArrayList<String>osztaly = osztalyok.get(cimke);
            if(osztaly != null){
                osztaly.add(szo);
            }
            else{
                ArrayList<String> ujOsztaly = new ArrayList<>();
                ujOsztaly.add(szo);
                osztalyok.put(cimke, ujOsztaly);
            }
        }
    }

    public void kiiratas(){
        for( String kulcs: osztalyok.keySet()){
            System.out.println(kulcs + " : " + osztalyok.get(kulcs));
        }
    }

    public static String cimkez(String szo) {
        char[] charArray = szo.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
