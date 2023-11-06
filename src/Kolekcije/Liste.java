package Kolekcije;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Liste {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>();
        lista.add(12);
        lista.add(13);
        lista.add(45);
        lista.add(3);
        lista.add(12);
        lista.add(12);


        lista.remove(1);

       // lista.clear();
        System.out.println(lista);
        if(!lista.isEmpty()){
            System.out.println("not empty");
        }
        for(int i = 0 ; i< lista.size(); i++){
            System.out.println(lista.get(i));
        }

        LinkedList<String> linkedList = new LinkedList<>(); //  -><-> <-> --
        linkedList.add("Pera");
        linkedList.add("Marko");
        linkedList.add("Djura");
for(String s:linkedList){
    System.out.println(s);
}
 List list = new ArrayList();
list.add("Pera");
list.add (65);
list.add(55.55);
list.add(true);
list.add('A');
for(Object s: list){
    System.out.println(s);
}

        Set<Integer> set = new LinkedHashSet<>(lista);// kad je HashSet onda je bez nekog redosleda a kad je LInkedHashSet onda je po redu
        System.out.println(set);
        set.add(44);

        Set<Integer> mySet = Set.of();

        List<Double> myList = List.of(5.5,6.7);

        List list2 = Arrays.asList(3,5);
        int [] niz = {1,2,3,4};

        List<Integer> list3 = new ArrayList(Arrays.asList(niz));


        ArrayList arrayList = new ArrayList(lista);
    }

}