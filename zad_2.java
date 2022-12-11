/*
Пусть дан список сотрудников:

Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zad_2 {

    public static void main(String[] args) {
        
        List<String> peoples = new ArrayList<>();

        peoples.add("Иван Иванов");
        peoples.add("Светлана Петрова");
        peoples.add("Кристина Белова");
        peoples.add("Анна Мусина");
        peoples.add("Анна Крутова");
        peoples.add("Иван Юрин");
        peoples.add("Петр Лыков");
        peoples.add("Павел Чернов");
        peoples.add("Петр Чернышов");
        peoples.add("Мария Федорова");
        peoples.add("Марина Светлова");
        peoples.add("Мария Савина");
        peoples.add("Мария Рыкова");
        peoples.add("Марина Лугова");
        peoples.add("Анна Владимирова");
        peoples.add("Иван Мечников");
        peoples.add("Иван Ежов");

        Map<String, Integer> result = new HashMap<>();
        found_count(peoples, result);
        List<String> sorted_result = new ArrayList<>();
        sorted_count(result, sorted_result);

    }

    public static void found_count(List<String> peoples, Map<String, Integer> result) {
        String[] temp_array;
        int nums;
        String temp;
        
        for (int i = 0; i < peoples.size(); i++) {
            temp = peoples.get(i);
            temp_array = temp.split(" ");
            temp = temp_array[0];
            if (result.containsKey(temp)) {
                nums = result.get(temp);
                result.put(temp, nums+1);                                               
            }
            else {
                result.put(temp, 1);
            }
        }
        System.out.println(result);
    }

    public static void sorted_count(Map<String, Integer> result, List<String> sorted_result) {

        String key;
        String count;
        int round = result.size();

        for (int i = 0; i < round; i++) {
            key = Collections.max(result.entrySet(), Map.Entry.comparingByValue()).getKey();
            count = result.get(key).toString();
            sorted_result.add(key + "=" + count);
            result.remove(key);
        }
        System.out.println(sorted_result);
    }
}