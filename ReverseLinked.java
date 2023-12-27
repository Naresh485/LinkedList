

public class ReverseLinked {

    public Node reverse(Node head)
    {   
        
        if(head==null || head.next==null)
        {
            return head;
        }
        Node dhead=reverse(head.next);
        Node temp=head.next;
        temp.next=head;
        head.next=null;

        return dhead;
    }
    
}
