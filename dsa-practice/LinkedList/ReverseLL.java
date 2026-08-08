import java.util.Stack;

public class ReverseLL{
    public static void traversal(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
}
    public static Node iterative1(Node head){// TC = O(N), SC = O(N)
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;}

        temp = head;
        while(temp!=null){
            temp.data = stack.peek();
            stack.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node iterative2(Node head){// TC = O(N), SC = O(1)
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            Node front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;}
        return prev;
    }

    public static Node recursive(Node head){// TC = O(N), SC = O(N)
        if(head == null || head.next == null){
            return head;}
            Node newHead=recursive(head.next);
            Node front = head.next;
                front.next = head;
                head.next= null;
            
        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next=new Node(5);
        head.next.next=new Node(1);
        head.next.next.next=new Node(8);
        head.next.next.next.next=new Node(2);
        traversal(head);
        // iterative1(head);
        // Node newhead = iterative2(head);
        Node newhead = recursive(head);
        traversal(newhead);
    }
    
}
