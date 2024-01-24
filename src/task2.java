import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Задание №1
Реализовать консольное приложение, которое:
1. Принимает от пользователя строку вида
text~num
2. Нужно рассплитить строку по :, сохранить text в связный список на
позицию num.
3. Если введено print:num, выводит строку из позиции num в связном
списке и удаляет её из списка.
* */
public class task2 {
    static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            if (run().equals("q")) {
                System.exit(0);
            }
            run();
        }
    }

    public static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void addNullIndex(int index) {
        for (int i = 0; i < index; i++) {
            stringList.add(null);
        }
    }

    public static String run() {
        System.out.println("Введите строку");
        String inpMess = prompt();
        if (inpMess.equals("q")) {
            System.exit(0);
        }
        String[] arrSplit = inpMess.split(":");
        String word = arrSplit[0];
        int index = Integer.parseInt(arrSplit[1]);
        if (index > stringList.size()) {
            addNullIndex(index);
        }
        if ((word.equals("print")) && (stringList.get(index) != null)) {
            System.out.println(stringList.get(index));
            stringList.remove(index);
        } else {
            stringList.add(index, word);
        }
        return inpMess;
    }
}
