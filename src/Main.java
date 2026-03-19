public class Main {
    public static void main(String[] args) {
        // get an obj from linked list
        SingleLinkedList sList = new SingleLinkedList();
        // append items to the list
        sList.append(10);
        sList.append(20);
        sList.append(30);
        sList.traverse();
        SingleLinkedList sList2 = new SingleLinkedList();
        sList2.append(40);
        sList2.append(50);
        sList2.append(60);
        sList2.append(70);
        sList2.traverse();
        // test merging two linked list
        sList.merge(sList2);
        sList.traverse();

//        sList.insertFirst(5);
//        sList.insertAtPosition(5, 0);
//        sList.traverse();
////        sList.insertFirst(1);
//        sList.insertAtPosition(25, 3);
//        sList.traverse();
//        // insert at position that not  exist
//        sList.insertAtPosition(100, 8);
//        sList.traverse();
        // test delete item function
//        sList.deleteItem(20);
//        sList.traverse();


    }


}