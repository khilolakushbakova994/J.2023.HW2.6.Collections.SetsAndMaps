import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }


    //Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
    // Код должен работать с любой последовательностью и объемом списка чисел.
    //В качестве отладочной информации можете использовать список чисел:
    public static void task1() {
        System.out.println("Задание 1");
        List<Integer> num = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int numbers:num) {
            if ((numbers % 2) != 0) {
                System.out.println(numbers);

            }

        }
    }

    public static void task2() {

        System.out.println(" Задание 2");
        // Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        // Код должен работать с любой последовательностью и объемом списка чисел.
        //В качестве отладочной информации можете использовать список чисел:

        List<Integer> num = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int numbers:num) {
            if (numbers % 2 == 0) {
                System.out.println(numbers);

            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        //Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
        // Код должен работать с любой последовательностью и объемом списка слов.
        //В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.


        Set<String> strings = new HashSet<>(List.of("один", "два", "два", "три", "три", "три"));
        strings.toString();
        System.out.println(strings);
    }


    public static void task4() {
        System.out.println("Задание 4");

        //Напишите код, который выводит в консоль количество дублей для каждого уникального слова.
        // Код должен работать с любой последовательностью и объемом списка слов.
        //В качестве отладочной информации используйте:


        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(strings.size()- uniqueWords.size());


    }
}

