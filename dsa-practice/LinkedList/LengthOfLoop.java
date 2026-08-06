import java.util.HashMap;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;}
    Node(int data, Node next){
        this.data = data;
        this.next = next;}}


public class LengthOfLoop {
    public static int loop1(Node head){//TC = O(2N*logN/1)   SC = O(N)
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        int timer=0;
        while (temp!=null) {
            if(map.containsKey(temp)){
                int looplength = timer-map.get(temp);
                return looplength;}
                map.put(temp, timer);
                timer++;
                temp = temp.next;}
        return 0;}

    public int loop2(Node head){//TC = O(N)   SC = O(1)
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return countLoopLength(slow);
            }
        }
        return 0; }

        public int countLoopLength(Node meetingPoint) {
        Node temp = meetingPoint;
        int length = 1;
        // Move until we meet again
        while (temp.next != meetingPoint) {
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9,head.next.next.next);
    }
}
