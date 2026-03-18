public class Main {
    public static void main(String[] args) {
        // get an obj from linked list
        SingleLinkedList sList = new SingleLinkedList();
        // append items to the list

        sList.append(10);
        sList.append(20);
        sList.append(30);
        sList.traverse();
//        sList.insertFirst(5);
        sList.insertAtPosition(5, 0);
        sList.traverse();
//        sList.insertFirst(1);
        sList.insertAtPosition(25, 3);
        sList.traverse();
        // insert at position that not  exist
        sList.insertAtPosition(100, 8);
        sList.traverse();


    }


}