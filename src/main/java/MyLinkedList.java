public class MyLinkedList<E> {

    private Node<E> head;

    private int numNodes;
    // ===== CONSTRUCTOR =====

    public MyLinkedList(E data) {

        head = new Node<>(data);

        numNodes = 1;
    }
    public void addFirst(E e) {

        Node<E> newNode =
                new Node<>(e);

        newNode.next = head;

        head = newNode;

        numNodes++;
    }
    public void addLast(E e) {

        Node<E> newNode =
                new Node<>(e);

        if (head == null) {

            head = newNode;

        } else {

            Node<E> temp = head;

            while (temp.next != null) {

                temp = temp.next;
            }

            temp.next = newNode;
        }

        numNodes++;
    }
    public void add(
            int index,
            E e
    ) {

        if (index < 0
                || index > numNodes) {

            System.out.println(
                    "Index invalid"
            );

            return;
        }

        if (index == 0) {

            addFirst(e);

            return;
        }

        Node<E> newNode =
                new Node<>(e);

        Node<E> temp = head;

        for (int i = 0;
             i < index - 1;
             i++) {

            temp = temp.next;
        }

        newNode.next = temp.next;

        temp.next = newNode;

        numNodes++;
    }
    public E removeFirst() {

        if (head == null) {

            return null;
        }

        E data = head.data;

        head = head.next;

        numNodes--;

        return data;
    }
    public E removeLast() {

        if (head == null) {

            return null;
        }

        if (head.next == null) {

            E data = head.data;

            head = null;

            numNodes--;

            return data;
        }

        Node<E> temp = head;

        while (temp.next.next != null) {

            temp = temp.next;
        }

        E data = temp.next.data;

        temp.next = null;

        numNodes--;

        return data;
    }
    public E get(
            int index
    ) {

        if (index < 0
                || index >= numNodes) {

            return null;
        }

        Node<E> temp = head;

        for (int i = 0;
             i < index;
             i++) {

            temp = temp.next;
        }

        return temp.data;
    }
    public int size() {

        return numNodes;
    }
    public boolean contains(E e) {

        Node<E> temp = head;

        while (temp != null) {

            if (temp.data.equals(e)) {

                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    public E remove(int index) {

        if (index < 0
                || index >= numNodes) {

            return null;
        }

        Node<E> temp = head;

        if (index == 0) {

            head = head.next;

            numNodes--;

            return temp.data;
        }

        for (int i = 0;
             i < index - 1;
             i++) {

            temp = temp.next;
        }

        Node<E> removedNode =
                temp.next;

        temp.next =
                removedNode.next;

        numNodes--;

        return removedNode.data;
    }

    public void printList() {

        Node<E> temp = head;

        while (temp != null) {

            System.out.print(
                    temp.data + " -> "
            );

            temp = temp.next;
        }

        System.out.println("null");
    }
    public MyLinkedList<E> clone() {

        MyLinkedList<E> newList =
                new MyLinkedList<>(head.data);

        Node<E> temp =
                head.next;

        while (temp != null) {

            newList.addLast(
                    temp.data
            );

            temp = temp.next;
        }

        return newList;
    }
    public int indexOf(E o) {

        Node<E> temp = head;

        int index = 0;

        while (temp != null) {

            if (temp.data.equals(o)) {

                return index;
            }

            temp = temp.next;

            index++;
        }

        return -1;
    }


}