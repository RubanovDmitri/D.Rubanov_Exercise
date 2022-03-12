import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringTasks.reverseString("Dima");
        System.out.println(StringTasks.changeChar("Dima", 'i', 'o'));
        System.out.println(StringTasks.deletChar("Ambulance", "a"));
        StringTasks.getCharCount("Collaboration", 'c');
        StringTasks.printStr("Some", "||", 3);
        System.out.println();
        System.out.println(StringTasks.getFactorial(5));
        System.out.println(StringTasks.isStrPalindrome("Я иду с мечем судия"));

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(-3);
        nums.add(2);
        nums.add(6);
        nums.add(10);
        nums.add(-6);
        nums.add(4);
        nums.add(87);
        nums.add(-311);
        nums.add(200);
        nums.add(16);
        nums.add(15);

        List<Integer> newNum = StreamTasks.transformMinus(nums);

        for (Integer num : newNum) {
            System.out.println(num);
        }

        List<Integer> secondNum = StreamTasks.secondStreamTask(nums);
        System.out.println("Is two list has equal size? " + (nums.size() == secondNum.size()));
        for (Integer num : secondNum) {
            System.out.println(num);
        }

        List<String> surnames = new ArrayList<>();
        surnames.add("Артемонов");
        surnames.add("Кулеба");
        surnames.add("Абрамович");
        surnames.add("Рубанов");
        surnames.add("Авсенов");
        surnames.add("Крот");

        List<String> surnamesWithA = StreamTasks.surnamesTask(surnames);
        for (String surname : surnamesWithA) {
            System.out.println(surname);
        }
    }
}
