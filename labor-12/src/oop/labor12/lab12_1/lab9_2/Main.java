package oop.labor12.lab12_1.lab9_2;

public class Main {
    public static void main(String[] args) {
//        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
//        Scanner scanner = new Scanner(System.in);
//        while( true ) {
//            System.out.print("Word to find ( Enter <end> for exit): ");
//            String word = scanner.nextLine();
//            if( word.equalsIgnoreCase( "end")){
//                break;
//            }
//            System.out.println(" Find(" + word + "): " + service.findWord(word));
//        }
//        scanner.close();
//
//        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
//        System.out.println("Unknown words from a file: ");
//        System.out.println(service.findWordsFile( "words.txt"));
//        //DictionaryService.findWordsFile("words.txt");

        System.out.println("ArrayListDictionary");
        long startTime = System.nanoTime();
        DictionaryService service = new DictionaryService(DictionaryType.ARRAY_LIST);
        service.findWordsFile("bible.txt");
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed / 1000000);


        System.out.println("\nHashSetDictionary");
        long startTime2 = System.nanoTime();
        DictionaryService service2 = new DictionaryService(DictionaryType.HASH_SET);
        service.findWordsFile("bible.txt");
        long endTime2 = System.nanoTime();
        long timeElapsed2 = endTime2 - startTime2;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed2 / 1000000);

        System.out.println("\nTreeSetDictionary");
        long startTime3 = System.nanoTime();
        DictionaryService service3 = new DictionaryService(DictionaryType.TREE_SET);
        service.findWordsFile("bible.txt");
        long endTime3 = System.nanoTime();
        long timeElapsed3 = endTime3 - startTime3;
        System.out.println("Execution time in milliseconds: " +
                timeElapsed3 / 1000000);
    }

}
