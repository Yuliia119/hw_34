public class Main {
    public static void main(String[] args) {
        MyList myList = new MyLinkedList();
        myList.add(new Person("Alice"));
        myList.add(new Person("Oleg"));
        myList.add(new Person("Lena"));
        myList.add(new Person("Ivan"));

        System.out.println(myList.size());
        myList.print();

    }
}