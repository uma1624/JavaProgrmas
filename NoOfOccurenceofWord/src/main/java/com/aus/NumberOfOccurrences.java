package com.aus;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        String str = "Hello how are you how is your health health health say Hello to you ";
        String[] words = str.split("\\s");
        Map<String,Integer> wordsCount = new HashMap<>();
        wordsCount.put(words[0],1);
       for (int i=1;i<words.length;i++){
           if(wordsCount.containsKey(words[i])){
              Integer key = wordsCount.get(words[i]);
              wordsCount.put(words[i],++key);
           }
           else {
               wordsCount.put(words[i],1);
           }
       }
       for(Map.Entry<String,Integer> word :wordsCount.entrySet()){
           System.out.println(word.getKey()+" "+word.getValue());
       }
       System.out.println("================java 8 ================");
       List<String> strList = Arrays.asList(words);
       Map<String ,Long> map  = strList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       map.entrySet().stream().forEach(System.out::print);

    }
}
