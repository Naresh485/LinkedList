public class BubbleSortLL {

    public Node sortList(Node head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        else
        {
            Node fNode=head;
            Node sNode=head.next;
            if(fNode.data>sNode.data)
            {
                head=sNode;
                fNode.next=sNode.next;
                sNode.next=fNode;
            }
        

        }
        return head;
    }
    
}
