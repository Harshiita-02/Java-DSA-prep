import java.util.HashMap;

public class DetectLoop {
    public static Boolean loop1(Node head){//TC = O(2N*logN/1)   SC = O(N)
        HashMap<Node,Integer> map = new HashMap<>();
        Node temp = head;
        while (temp!=null) {
            if(map.containsKey(temp)){return true;}
                map.put(temp, 1);
                temp = temp.next;
        }

        return false;}

    public static Boolean loop2(Node head){//TC = O(N)   SC = O(1)
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){return true;}
        }
        return false; }
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

        if(loop1(head)){System.out.println("has a loop");}
        else{System.out.println("no loop");}

        if(loop2(head)){System.out.println("has a loop");}
        else{System.out.println("no loop");}
    }
}
