public class SingleLinkedList {
    // linked list must contain a pointer called head
    // a head used to point to a first node in list, and it's type is Node
    Node head;

    // used to add item at the first index of list
    public void insertFirst(int item) {


    }

    // ,and it's a traditional type of inserting
    public void append(int item) {
        //create obj to create node
        Node newNode = new Node(item);
        // check if head =null
        if (head == null) {
            // pass the new obj to the head
            head = newNode;
        }
        // if head not equal null
        else {
            // create a pointer to hold the current node on it starts from first  node (head)
            Node currPointer = head;
            // traverse between nodes until find the node with next pointer = null
            //check if currPointer.next is null or not
            while (currPointer.next != null) {
                // if currPointer.next not equal null
                // assign the currentPointer.next to the currPointer
                currPointer = currPointer.next;

            }
            //else currentPointer.next=null
            // pass the new node to the current pointer
            currPointer.next = newNode;
        }
    }

    public void insertAtPosition(int item, int position) {
    }

    // traverse used to looping on the list and display all items in it
    public void traverse() {
        // make a pointer to point to a first node in list
        Node currPointer = head;
        // use pointer to traverse on the nodes \
        while (currPointer != null) {
            // display the node data
            System.out.print(currPointer.data + "-->");
            // move to the second node
            currPointer = currPointer.next;
        }
        // display a null message after a list displaying list
        System.out.println("null");

    }

    public void delete(int item) {
    }
}
