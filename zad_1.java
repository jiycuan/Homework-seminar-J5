// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zad_1 {
    
    public static void main(String[] args) {
        
        Map<Integer, String> peoples = new HashMap<>();
        peoples.put(1, "Иван Иванов, +79999999999");
        peoples.put(2, "Светлана Петрова, +79999999999");
        peoples.put(3, "Кристина Белова, +79999999999");
        peoples.put(4, "Анна Мусина, +79999999999");
        peoples.put(5, "Анна Крутова, +79999999999");
        peoples.put(6, "Иван Юрин, +79999999999");
        peoples.put(7, "Петр Лыков, +79999999999");
        peoples.put(8, "Павел Чернов, +79999999999");
        peoples.put(9, "Петр Чернышов, +79999999999");
        peoples.put(10, "Мария Федорова, +79999999999");
        peoples.put(11, "Марина Светлова, +79999999999");
        peoples.put(12, "Мария Савина, +79999999999");
        peoples.put(13, "Мария Рыкова, +79999999999");
        peoples.put(14, "Марина Лугова, +79999999999");
        peoples.put(15, "Анна Владимирова, +79999999999");
        peoples.put(16, "Иван Мечников, +79999999999");
        peoples.put(17, "Иван Ежов, +79999999999");

        int count = peoples.size();
        work_phone_list(count, peoples);
        System.out.println(peoples);
    }

    public static void work_phone_list(int count, Map<Integer, String> peoples) {

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите ФИО человека: ");
        String key = in.nextLine();
        System.out.println("Введите номер телефона: ");
        String phone = in.nextLine();
        peoples.put(count+1,key+", "+phone);
        count = peoples.size();

        System.out.println("Если необходимо добавить ещё одного человека в телефонную книгу - введите 1. Если нет - 0");
        Integer iffer = in.nextInt();
        if (iffer == 1) {
            work_phone_list(count, peoples);
        in.close();
        }
    }
}