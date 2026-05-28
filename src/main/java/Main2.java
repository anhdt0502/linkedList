public class Main2 {

    public static void main(String[] args) {

        MyArrayList<Integer> list =
                new MyArrayList<>();

        list.add(10);

        list.add(20);

        list.add(30);

        list.add(1, 15);

        list.printList();

        System.out.println(
                "Size: "
                        + list.size()
        );

        System.out.println(
                "Get index 2: "
                        + list.get(2)
        );

        System.out.println(
                "Contains 20: "
                        + list.contains(20)
        );

        System.out.println(
                "Index of 30: "
                        + list.indexOf(30)
        );

        list.remove(1);

        list.printList();

        list.remove(Integer.valueOf(30));

        list.printList();

        MyArrayList<Integer> cloneList =
                list.clone();

        System.out.println(
                "Clone List:"
        );

        cloneList.printList();

        list.clear();

        System.out.println(
                "After clear:"
        );

        list.printList();
    }
}