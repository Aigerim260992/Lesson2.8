package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String[]> dictionary = new HashMap<>();

        dictionary.put("красивый", new String[]{"прекрасный", "чудесный",
        "великолепный", "симпотичный"});
        dictionary.put("дом", new String[]{"квартира", "жилище",
        "аппартаменты", "хижина"});
        dictionary.put("человек", new String[]{"мужчина", "личность", "хомосапиенс", "индивид"});

        HashMap<String, String[]> dictionary2 = new HashMap<>();
        Set<String > key = dictionary.keySet();
        Iterator iterator = key.iterator();
        while (iterator.hasNext()){
            String keys = iterator.next().toString();
            String [] word = dictionary.get(keys);
            dictionary2.put(keys,word);
            for (int i = 0; i < word.length ; i++) {
                String newKey = word[i];
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.addAll(Arrays.asList(word));
                arrayList.remove(newKey);
                arrayList.add(keys);
                String [] newValue = new String[arrayList.size()];
                newValue = arrayList.toArray(newValue);
                dictionary2.put(newKey,newValue);


            }
        }
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        String[] words = dictionary2.get(word);
        Random r = new Random();
       int index = r.nextInt(words.length);
        System.out.println(words[index]);


    }
}
