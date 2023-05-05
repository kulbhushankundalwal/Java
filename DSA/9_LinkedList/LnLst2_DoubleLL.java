public class LnLst2_DoubleLL {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //print
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    //removeFirst
    public int removeFirst(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //removeLast
    public int removeLast(){
        if(head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }

        if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LnLst2_DoubleLL dLL = new LnLst2_DoubleLL();
        dLL.addFirst(1);
        dLL.addFirst(2);
        dLL.addFirst(3);
        dLL.addFirst(4);

        dLL.printLL();
        System.out.println("Size is: " + dLL.size);

        dLL.addLast(29);
        dLL.printLL();
        System.out.println("Size is: " + dLL.size);

        dLL.removeFirst();
        dLL.printLL();

        dLL.removeLast();
        dLL.printLL();

    }
}
