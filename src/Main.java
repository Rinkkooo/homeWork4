import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите строку для первого списка: ");
            arrayList.add(scanner.nextLine());
            System.out.println("Введите строку для второго списка: ");
            arrayList1.add(scanner.nextLine());

        }
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println(Arrays.toString(arrayList1.toArray()));



        ArrayList<String> c = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            c.add(arrayList.get(i));
            c.add(arrayList1.get(arrayList1.size() - 1 - i));
        }
//        c.addAll(arrayList);
//        c.addAll(arrayList1);
        System.out.println(Arrays.toString(c.toArray()));

        Collections.sort(c, Comparator.comparingInt(String :: length));
        System.out.println(Arrays.toString(c.toArray()));
    }

}