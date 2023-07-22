public class LnLst1_LLMethods {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

// To add node at first
    public static void addFirst(int data) {

        // create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // newNode.next = head
        newNode.next = head; // link

        // head = newNode
        head = newNode;
    }

// To add node at last
    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

//To print the Linked List
    public static void print(){
        if(head == null){
            System.out.println("Linked List is empty");
        }

        Node temp = head;
        while(temp != null){
            System.err.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

//To insert a node between the Linked List at an index
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1){
            temp = temp.next;
            i++;
        }

        //i=idx-1 & temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

//To remove first node
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

//To remove last node
    public int removeLast(){
        if(size==0){
            System.out.println("LL is already empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node temp = head;
        for(int i=0; i<size-2; i++){
            temp = temp.next;
        }
        int val = temp.next.data; //or tail.data
        temp.next = null;
        tail = temp;
        size--;
        return val;

    }

//To search an element using iterative method O(n)
    public int itrSearch(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

//To search an element using recursive method O(n) & O(n) space comp -> call stack
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head, key);
    }

//To reverse an LL
    public void reverse(){ //trick -> 3 variables, 4 syntax in while
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){  //trick to learn -> syntax are forming closed loop
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        LnLst1_LLMethods ll = new LnLst1_LLMethods();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();

        ll.add(2, 3);
        ll.print();

        System.out.println("Size of LL is: " + ll.size);

        ll.removeFirst();
        ll.print();
        
        ll.removeLast();
        ll.print();

        System.out.print("Searching element 3 in th LL, Found at index: ");
        System.out.println(ll.itrSearch(3));

        System.out.print("Searching element 3 in th LL, Found at index: ");
        System.out.println(ll.recSearch(3));

        ll.reverse();
        ll.print();
    }
}
