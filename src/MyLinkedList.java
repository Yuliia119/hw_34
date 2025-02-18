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

    private static class Node {
        private Node prev;
        private Person value;
        private Node next;

        public Node(Node prev, Person value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        public Person getValue() {
            return value;
        }

        public void setValue(Person value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }
}


