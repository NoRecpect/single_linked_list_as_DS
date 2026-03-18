public class SingleLinkedList {
    // linked list must contain a pointer called head
    // a head used to point to a first node in list, and it's type is Node
    Node head;

    // used to add item at the first index of list
    public void insertFirst(int item) {
        // make an object from node
        Node newNode = new Node(item);
        // make a new node point to the first node in list before making it a first node
        newNode.next = head;
        // making a new node first node in the list
        head = newNode;
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
        // make the node want to add to the list
        Node newNode = new Node(item);
        // check if the position is equal to zero insert the node to the first place in list
        if (position == 0) {
            // call the insertFirst function
            insertFirst(item);
            return;
        }
        // make a pointer to traverse on the list  starts from zero position(head)
        Node currentPointer = head;
        // make an index to know where Am I in the list ?
        int index = 0;
        // looping on the list to go the position I want
        // if I don't exit the list and the index <position -1
        while (currentPointer != null && index < position - 1) {
            // move to the next node and increment index by 1
            currentPointer = currentPointer.next;
            index++;

        }
        // precaution اجراء احترازي
        // if current is null position is beyond the end of the list
        if (currentPointer == null) {
            System.out.println("position is out of bounds");
            return;
        }
        // join the nodes
        // make the new node points to the next node
        newNode.next = currentPointer.next;
        // make the current node points to the new node
        currentPointer.next = newNode;


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
