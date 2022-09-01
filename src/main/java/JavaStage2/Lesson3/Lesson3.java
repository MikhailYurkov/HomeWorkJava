package JavaStage2.Lesson3;

import java.util.*;

public class Lesson3 {
    public static void main(String[] args) {
        String[] words = {"lock", "fork", "nock", "golf", "lock", "dog", "cat", "pet", "lock", "nock"};


        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");


        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");

        // subtask 2
        PhoneBook pb = new PhoneBook();

        pb.add("Ivanov", "123");
        pb.add("Petrov", "456");
        pb.add("Petrov", "789");

        System.out.println(pb.get("Petrov"));
    }
}