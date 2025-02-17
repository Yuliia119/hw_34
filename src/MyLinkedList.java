public class MyLinkedList implements MyList {
    private Node head = null;
    private Node tail = null;
    private int size = 0;

    @Override
    public void add(Person element) { // метод добавляет элемент в конец списка
        Node node = new Node(null, element, null); //создает новый Node
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
        }
        size++;
    }

    @Override
    public int size() { //вернет количество элементов в списке
        return size;
    }

    @Override
    public Person get(int index) { //получит элемент по индексу
        return null;
    }

    @Override
    public void print() { //вывод всех элементов списка
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }
}