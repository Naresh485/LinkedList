public class MergeSortLL {

    public Node sortlist(Node head){
        if(head==null|| head.next==null)
        {
        return head;
        }
        Node mid=middlenode(head);
        Node left=sortlist(head);
        Node right=sortlist(mid);

        return merge(left, right);
    }
    

    Node merge(Node list1, Node list2)
    {
        Node dummyhead=new Node();
        Node tail=dummyhead;

        while(list1!=null&&list2!=null)
        {
            if(list1.data < list2.data)
            {
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
            }
            else{
                 tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        /* Copy the remaining nodes of non-empty lists to the tail of the merged list */
        if (list1 != null) tail.next = list1;
        else      tail.next = list2;

        return dummyhead.next;   //return head of the merged linked list
    }

    Node middlenode(Node head)
    {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;

        }
        if(prev!=null)
        {
            prev.next=null;
        }
        return slow;
    }

//  For find =ing the middle node and split  list into two halfs
    // ListNode middlenode(ListNode head)
    // {
    //     ListNode midPrev=null;
    //     while(head != null && head.next != null)
    //     {
    //         midPrev = (midPrev == null) ? head: midPrev.next;
    //         head=head.next.next;

    //     }

    //     ListNode mid =midPrev.next;
    //     midPrev.next=null;
        
    //     return mid;
    // }
    
    
}
