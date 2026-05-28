public class Main {

    public static void main(String[] args) {

        MyLinkedList<Integer> list =
                new MyLinkedList<>(10);

        list.addLast(20);

        list.addLast(30);

        list.addFirst(5);

        list.add(2, 15);

        list.printList();

        System.out.println(
                "\nSize: "
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

        list.removeFirst();

        list.printList();

        list.removeLast();

        list.printList();

        MyLinkedList<Integer> cloneList = list.clone();

        System.out.println(
                "\nClone List:"
        );

        cloneList.printList();
    }
}