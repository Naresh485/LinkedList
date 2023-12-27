
public class LL {

    Node head;
    Node tail;

    // inserting node at the first node of the linked list
    public void insertFirst(int data)
    {
        Node node=new Node(data,head);
        // node.data=data;
        // node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }

        
    }

    // inserting node at the end of a linked list
    public void insertLast(int data)
    {
        Node node=new Node(data);
        // node.data=data;
        node.next=null;
        if(head==null)
        {
            insertFirst(data);
            return;
        }
        tail.next=node;
        tail=node;

    }


    //  insert using recursion
    public void insertRec(int data, int index)
    {
        head=insertNode(data, index, head);
    }

    private Node insertNode(int data,int index, Node node)
    {
        if(index==0)
        {
            Node temp=new Node(data,node);
            return temp;
        }

        node.next=insertNode(data, index-1, node.next);
        return node;
    }


    // delete duplicates from a sorted list
    public void removeDup()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==temp.next.data)
            {
                temp.next=temp.next.next; 
            }
            else
            {
            temp=temp.next;
            }
        } 
    }

    // merge two sorted linked lists

    public static LL merge(LL first, LL second)
    {
        Node f=first.head;
        Node s=second.head;

        LL ans=new LL();

        while(f!=null&&s!=null)
        {
            if(f.data<s.data)
            {
                ans.insertLast(f.data);
                f=f.next;
            }
            else{
                ans.insertLast(s.data);
                s=s.next;
            }
        }

        while(f!=null)
        {
            ans.insertLast(f.data);
            f=f.next;
        }
        while(s!=null)
        {
            ans.insertLast(s.data);
            s=s.next;
        }

        return ans;
    }


    //  Finding loop
    public boolean hasCycle(Node head) {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null)
            {
                f=f.next.next;
                s=s.next;
                if(f==s)
                {
                    return true;
                }   
            }

        return false;
    }

    // https://leetcode.com/problems/linked-list-cycle-ii/ find the node where cycle starts

    public Node detectCycle(Node head) 
    {
        
        return head;
    }


    // length of the cycle



    public int lengthCycle(Node head) {
        Node f=head;
        Node s=head;
        while(f!=null && f.next!=null)
            {
                f=f.next.next;
                s=s.next;
                if(f==s)
                {
                    Node temp=s;
                    int length=0;
                    do{
                        temp=temp.next;
                    }while(temp!=s);
                    return length;
                }   
            }

return 0;
    }

    // find a happy  number if their squares is 1 return true else false

    public boolean isHappy(int  n)
    {
        int slow=n;
        int fast=n;

        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(slow!=fast);

        if(slow==1)
        {
            return true;
        }
        return false;
    }

    public int findSquare(int number)
    {
        int ans=0;

        while(number>0)
        {
            int rem=number%10;
            ans+=rem*rem;
            number=number/10;

        }

        return ans;
    }

    // finding middle of the linked list

    public Node middlenode(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }


    // inserting node in linked list at specified position

    public void insertAt(int index, int data)
    {
        Node node=new Node(data);
        // node.data=data;
        node.next=null;

        if (index==0)
        {
            insertFirst(data);
            return;
        }

        Node n=head;
        for(int i=1;i<index;i++)
        {
            n=n.next;
        }
        if(n!=null)
        {
            node.next=n.next;
            n.next=node;
            if(node.next==null)
            {   
                tail=node;
            }
        }
    }

//  deleting first element from linked list
    public int deleteFirst()
    {
       int val=head.data;
       head=head.next;
       if (head==null)
       {
        tail=null;
       }

       return val;
    }
    {

    }

//  deleting last element fo linked list

    public Node deleteLast()
    {
        Node node;
        if(head==null||head.next==null)
        {
            head=null;
            tail=null;
            node=head;
        }
        else{
            Node temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            tail=temp;
            node=temp.next;
            temp.next=null;
        }

        return node;
       

    }

    // Deleting node from linked list at specified position
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
            if(head==null)
            {
                tail=null;
            }

        }
        else{
            Node n=head;
            
            for(int i=1;i<index;i++)
            {
                n=n.next;
            }
            
            Node temp1=n.next;
            if(temp1.next==null)
            {
                n.next=null;
                tail=n;
                temp1=null;
            }
            else{
                n.next=temp1.next;
                temp1=null;
            }
        }
    }
    
    // find the node of a element

    public Node find(int val)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.data==val)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    // get node with index

    public Node get(int index)
    {
        Node node=head;
        for(int i=0; i<index; i++)
        {
            node=node.next;
        }
        return node;
    }


    // method to display linked list elemnts
    public void display()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                System.out.print(n.data+"->");
                n=n.next;
                
            }
            System.out.println(n.data);
        }
    } 
    
    // reverse a singly linked list
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

    // 
}
