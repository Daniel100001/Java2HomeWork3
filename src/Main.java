import javax.management.ObjectName;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listB = new ArrayList<>();

        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа A: " + i + " из 5");
            listA.add(scanner.next());
            }
        System.out.println("Список А: " + listA);

        int length = listA.size();

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение для  листа Б: " + i + " из 5");
            listB.add(scanner.next());
            }
        System.out.println("Список Б: " + listB);

        ArrayList<String> listC = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
         listC.add(listA.get(i));
         listC.add(listB.get(i));
         }
        System.out.println("Список С: " + listC);

        System.out.println(" Отсортированный список ");
        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
        }
    }
