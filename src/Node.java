public class Node {  // один узел двусвязного списка
    private Node prev;  // ссылка на предыдущий узел
    private Person value; // значение, которое хранит
    private Node next; // ссылка на следующий узел

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
    public Node getPrev(){
        return prev;
    }
    public void setPrev(Node prev){
        this.prev = prev;
    }
}
