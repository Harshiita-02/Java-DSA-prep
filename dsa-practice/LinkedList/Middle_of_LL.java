public class Middle_of_LL {

    public static Node mid(Node head){// TC = O(N + N/2) = O(N), SC = O(1)
        if(head == null){return null;}
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp=temp.next;}

        int midNode = (count/2)+1;
        temp = head;
        while(temp!=null){
            midNode = midNode-1;
            if(midNode==0){break;}
            temp=temp.next;}
        return temp;}

    public static Node fast_slow_midNode(Node head){//TC = O(N/2) = O(N), SC = O(1)
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;}
        return slow;}

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        // Node midNode = mid(head);
        Node midNode = fast_slow_midNode(head);
        System.out.println("Middle node data: " + midNode.data);
    }
}
