public class MyArrayList<E> {

    private int size = 0;

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;

    // ===== CONSTRUCTOR =====

    public MyArrayList() {

        elements =
                new Object[DEFAULT_CAPACITY];
    }

    // ===== ADD =====

    public void add(E element) {

        ensureCapacity();

        elements[size] = element;

        size++;
    }

    // ===== ADD INDEX =====

    public void add(
            int index,
            E element
    ) {

        if (index < 0
                || index > size) {

            System.out.println(
                    "Index invalid"
            );

            return;
        }

        ensureCapacity();

        for (int i = size;
             i > index;
             i--) {

            elements[i] = elements[i - 1];
        }

        elements[index] = element;

        size++;
    }

    // ===== REMOVE INDEX =====

    public E remove(int index) {

        if (index < 0
                || index >= size) {

            return null;
        }

        E removedElement =
                (E) elements[index];

        for (int i = index;
             i < size - 1;
             i++) {

            elements[i] =
                    elements[i + 1];
        }

        elements[size - 1] = null;

        size--;

        return removedElement;
    }

    // ===== REMOVE OBJECT =====

    public boolean remove(E element) {

        int index =
                indexOf(element);

        if (index == -1) {

            return false;
        }

        remove(index);

        return true;
    }

    // ===== GET =====

    public E get(int index) {

        if (index < 0
                || index >= size) {

            return null;
        }

        return (E) elements[index];
    }

    // ===== SIZE =====

    public int size() {

        return size;
    }

    // ===== CLEAR =====

    public void clear() {

        elements =
                new Object[DEFAULT_CAPACITY];

        size = 0;
    }

    // ===== CONTAINS =====

    public boolean contains(E element) {

        return indexOf(element) != -1;
    }

    // ===== INDEX OF =====

    public int indexOf(E element) {

        for (int i = 0;
             i < size;
             i++) {

            if (elements[i]
                    .equals(element)) {

                return i;
            }
        }

        return -1;
    }

    // ===== CLONE =====

    public MyArrayList<E> clone() {

        MyArrayList<E> newList =
                new MyArrayList<>();

        for (int i = 0;
             i < size;
             i++) {

            newList.add(
                    (E) elements[i]
            );
        }

        return newList;
    }

    // ===== PRINT =====

    public void printList() {

        System.out.print("[");

        for (int i = 0;
             i < size;
             i++) {

            System.out.print(
                    elements[i]
            );

            if (i != size - 1) {

                System.out.print(", ");
            }
        }

        System.out.println("]");
    }

    // ===== ENSURE CAPACITY =====

    private void ensureCapacity() {

        if (size >= elements.length) {

            Object[] newElements =
                    new Object[
                            elements.length * 2
                            ];

            for (int i = 0;
                 i < elements.length;
                 i++) {

                newElements[i] =
                        elements[i];
            }

            elements = newElements;
        }
    }
}