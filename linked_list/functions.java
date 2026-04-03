class SLL{
    Node head ;
    Node tail;
    int size;
void InsertAtEnd(int val){ // add at tail 
        Node temp = new Node(val);
        if(head == null)head = tail = temp;
      else {
        tail.next = temp; 
        tail = temp; 
    }
    size++;
}
void display(){// its function display our linked list
      Node temp =head;
        while(temp != null) {
            System.out.print(temp.value + "  ");
            temp = temp.next;
        }
        System.out.println();
}
void InsertAthead(int val){
    Node temp = new Node(val);
    if(head==null) head = tail = temp;
    else{
        temp.next = head;
        head = temp;
    }
    size++;
}
void insert(int idx , int val){
    if(idx==0){
        InsertAthead(val);
        return;
    }
    if(idx ==size){
        InsertAtEnd(val);
        return;
    }
    if(idx>size || idx <0){
        System.out.println("invalid index !");
    }
    Node temp = new Node(val);
    Node x = head;
    for(int i =1;i<=idx -1;i++){
        x= x.next;
    }
    //now x is come to right position
    // then insertion
    temp.next = x.next;
    x.next= temp;
    size++;
}
int  get(int idx) throws Error{
    if(idx==size-1){
        return tail.value;
    }
    if(idx >=size || idx <0){
        throw new Error("error aa gya bhai");
    }
    Node temp = head;
    for (int i = 1; i <=idx; i++) {
        temp = temp.next;
    }
    return temp.value;
}
void set(int idx ,int val) {
    if(idx==size-1){
        tail.value =val;
        return;
    }
    if(idx >=size || idx <0){
        System.out.println("error aa gya bhai");
        return;
    }
    Node temp = head;
    for (int i = 1; i <=idx-1; i++) {
        temp = temp.next;
    }
    temp.value =val;
}
void deleteAtHead(){
    head = head.next;
    size--;
}
void delete(int idx){
    if(idx==0){
        deleteAtHead();
        return;
    }
    if(idx>size || idx<0){
        System.out.println("invalid index !");
    }
    Node temp =head;
    for(int i=1 ;i<=idx-1;i++){
        temp =temp.next;
    }
    if(temp.next == tail){
        tail =temp;
    }
    temp.next = temp.next.next;
    size--;
}

void size(){
    System.out.println(size);
}

}
public class functions {      
    public static void main(String[] args) {
        SLL List = new SLL(); // new Linked List
        List.InsertAtEnd(10);
        List.InsertAtEnd(20);
        List.InsertAtEnd(30);
        List.InsertAtEnd(40);
        List.InsertAtEnd(50);
        List.InsertAtEnd(60);
        List.InsertAtEnd(70);
        List.display();
        System.out.println(List.get(3));
        List.InsertAtEnd(500);
        List.InsertAthead(600);
        List.insert(4, 1000000);
        List.display(); 
        System.out.println(List.size);
        List.set(5, 10000);
        List.display(); 
        System.out.println(List.size);
        // System.out.println(List.get(-1));
        List.deleteAtHead();
        List.display(); 
        System.out.println(List.size);
        List.delete(3);
        List.display(); 
        System.out.println(List.size);
        System.out.println(List.tail.value);
        List.delete(7);
        List.display(); 
        System.out.println(List.size);
        System.out.println(List.tail.value);
    }
}
