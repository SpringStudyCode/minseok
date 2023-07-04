import java.util.ArrayList;

public class ListsExample {

    public static void main(String[] args) {

        // Lists
        // 순서 구분, 중복 허용
        // Vector, ArrayList, LinkedList

        // 기본적으로는 데이터 타입 제한X
        // ArrayList list = new ArrayList(10); // 인자는 list 크기

        // Integer 로 데이터 타입 제한
        //
        ArrayList<Integer> list = new ArrayList(10);
        list.add(100);
        list.add(150);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
