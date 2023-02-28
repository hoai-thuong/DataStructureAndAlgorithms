package Hw1.exercise7;


import Hw1.exercise6.SimpleArrayList;

public class WordCount extends SimpleArrayList<String> {
    public static void main(String[] args) {
        String str = "vo xinh dep vo xinh";
        String[] words = str.split("\\s");
//        System.out.println(words.length);
        SimpleArrayList<String> list = new SimpleArrayList<>();
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }

        SimpleArrayList<Integer> countWord = new SimpleArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            countWord.add(count);
        }

        for (int i = 0; i < countWord.size(); i++) {
            System.out.print("Word " + list.get(i) + " appears ");
            System.out.print(countWord.get(i));
            System.out.println(" times");
        }
    }

}
