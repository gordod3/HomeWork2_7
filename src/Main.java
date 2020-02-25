import java.util.*;

public class Main {
    private static void quickIterator(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object o = iterator.next();
            System.out.println(o.toString());
        }
    }
    private static void quickEditList(Collection collection){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите 5 имен через enter которые вы знаете: ");
        Name[] names = new  Name[]{new Name(scanner.next()),new Name(scanner.next()),new Name(scanner.next()),new Name(scanner.next()),new Name(scanner.next()),};
        Collections.addAll(collection, names);
        Iterator iterator = collection.iterator();
        int i = 0;
        while (iterator.hasNext()){
            i++;
            Object d = iterator.next();
            System.out.println(i + " " + d.toString());
        }
        System.out.println("______________________________");
    }

    public static void main(String[] args) {
        ArrayList listA = new  ArrayList();
        ArrayList listB = new  ArrayList();
        ArrayList listC = new  ArrayList();
        System.out.println("Создается лист имен А...");
        quickEditList(listA);
        System.out.println("Создается лист имен В...");
        quickEditList(listB);
        int a=0,b=4;
        while (a <= 4){
            listC.add(listA.get(a));
            listC.add(listB.get(b));
            a++;
            b--;
        }
        quickIterator(listC);
        System.out.println("______________________________");
        Comparator<Name> comparator = new Comparator<Name>() {
            @Override
            public int compare(Name o1, Name o2) {
                return o1.getName().length() - o2.getName().length();
            }
        };
        listC.sort(comparator);
        quickIterator(listC);
    }
}
