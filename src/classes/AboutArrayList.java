package classes;

import java.util.ArrayList;

public class AboutArrayList {
    /*
    ArrayList : Java 의 컬렉션 프레임워크의 일부로 List 인터페이스를 상속받은 클래스 중 하나
    배열을 기반으로 하나 차이점 존재, 데이터의 크기에 따라 공간을 늘리거나 줄임
    Array 의 동적 배열이 ArrayList 라고 생각해도 됨
    Array : 크기가 고정되어 있음
     */

    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        //
        ArrayList<Integer> listInteger = new ArrayList<>();

        // add (요소 추가)
        list.add("apple");
        list.add("orange");
        list.add("banana");
        list.add("grape");
        //
        listInteger.add(1);
        listInteger.add(134);
        listInteger.add(3645);
        listInteger.add(65789);

        // print (요소 출력)
        System.out.println(list);
        //
        System.out.println(listInteger);
        System.out.println("======================================");

        // 특정 요소 접근 (배열처럼, index start form 0)
        String fruit = list.get(1); // with get()
        System.out.println("fruit = " + fruit);
        System.out.println("Integer = " + listInteger.get(3));
        System.out.println("======================================");

        // remove (요소 제거)
        list.remove(1); // with index
        System.out.println("Delete with index: " + list);
        list.add("orange");
        System.out.println(list);
        System.out.println("======================================");
        list.remove("orange");
        System.out.println("Delete with String: " + list);
        list.add("orange");
        System.out.println(list);
        System.out.println("Delete with Integer: " + 3645);
        System.out.println("======================================");

        // size (크기 확인)
        System.out.println("Size: " + list.size());
        System.out.println("Size: " + listInteger.size());
        System.out.println("======================================");

        // contains (요소 존재 여부 확인)
        boolean isContains = list.contains("orange");
        System.out.println("Contains 'orange': " + isContains);
        System.out.println("Contains '65789': " + list.contains("65789"));
        System.out.println("======================================");

        // print with loop
        for (String cudamono : list) {
            System.out.println("Item: " + cudamono);
        }
        for (int i : listInteger) {
            System.out.println("Integer: " + i);
        }
        System.out.println("======================================");
    }
}
