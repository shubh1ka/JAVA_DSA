package LinkedList;
class Node{ // user defined data type
    int val;
    Node next;
    Node(int val){
        this.val = val;

    }
}
class Linkedlist { // user defined data structure
    Node head; // null
    Node tail; // null
    int size;

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;

    }
    void deleteAtHead() {
        if(head==null){
            System.out.println("List Is Empty");
            return;
        }
        head = head.next;
        if(head==null) tail = null;
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp= temp.next;
        }
        System.out.println();
    }
    int get(int idx){
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }


    void insert(int val, int idx) {
        if(idx==0 ||  idx>size){
            System.out.println("invalid Index");
            return;
        }
        if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else{
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp=temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }


    public static class LinkedListDataStructure {
        public static void main(String[] args) {
            Linkedlist ll = new Linkedlist();
            System.out.println("LinkedList Size is:" + ll.size);
            ll.addAtTail(10); ll.display();
            ll.addAtTail(20); ll.display();
            ll.addAtTail(30); ll.display();
            ll.addAtTail(40); ll.display();
            ll.addAtHead(90); ll.display();
            ll.addAtHead(100); ll.display();
            ll.deleteAtHead(); ll.display();
            System.out.println("LinkedList Size is:"+ ll.size);
            ll.insert(45,2); ll.display();

        }


    }


}