public class Dlist {
    Node head;
    Node tail;
    int size;

    public void insertFirst(int data)
    {
        Node node=new Node(data);
        // node.data=data;
        node.next=head;
        if(head!=null)
        {
            head.prev=node;
        }
        else
        {
            tail=node;
        }
        head=node;
        size++;
    }

    // method to insert at the last of the DLL
public void insertLast(int data)
{
    if(head==null)
    {
        insertFirst(data);
        return;
    }
    Node node=new Node(data);
    // node.data=data;
    node.next=null;
    tail.next=node;
    node.prev=tail;
    tail=node;
}

// without tail

public void insertLasts(int data)
{
    Node node=new Node(data);
    // node.data=data;
    node.next=null;
    Node n=head;
    if(head==null)
    {
        insertFirst(data);
        return;
    }
    while(n.next!=null)
    {
        n=n.next;//n=34
    }
    n.next=node;
    node.prev=n; 
}

// method to insert values in DLL
public void insert(int data,int index)
{
    Node node=new Node(data);
    // node.data=data;

    if(head==null)
    {
        insertFirst(data);
        return;
    }
    
    if(index==size)
    {
        insertLast(data);
        return;
    }
    Node temp=head;
    for(int i=1;i<index;i++)
    {
        temp=temp.next;
    }
    if(temp.next==null)
    {
        insertLast(data);
        
    }
    else
    {
        Node temp1=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next=temp1;
        if(temp1!=null)
        {
            temp1.prev=node;
        }

    }
        
}

///////
public Node find(int data)
{
    Node n=head;
    while(n!=null)
    {
        if(n.data==data)
        {
            return n;
        }
        n=n.next;
    }
    return null;
}

public void insertAfteri(int data,int data1)
{
    Node node=new Node(data1);
    // node.data=data1;
    Node prevNode=find(data);
    if(prevNode!=null)
    {
        Node temp=prevNode.next;
        node.next=prevNode.next;
        prevNode.next=node;
        node.prev=prevNode;
        if(temp!=null)
        {
            temp.prev=node;
        }
        

    }
    else{
        System.out.println("The given data is not present in the list");
        return;
    }
}

////////////

public void insertafter(int data,int index)
{
    Node node=new Node(data);
    // node.data=data;

    if(head==null)
    {
        insertFirst(data);
        return;
    }
    
    Node temp=head;
    for(int i=0;i<index+1;i++)
    {
        temp=temp.next;
    }
    if(temp.next==null)
    {
        insertLast(data);
        
    }
    else
    {
        Node temp1=temp.next;
        temp.next=node;
        node.prev=temp;
        node.next=temp1;
        if(temp1!=null)
        {
            temp1.prev=node;
        }

    }
        
}
    public void display()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            Node node=head;
            Node last=null;
            while(node!=null)
            {
                System.out.print(node.data+"->");
                last=node;
                node=node.next;
                
            }
            System.out.println("End");

            while(last!=null)
            {
                System.out.print(last.data+"->");
                last=last.prev;
            }
            System.out.println("head: "+head.data+" tail: "+tail.data);
        }
    }
    
}
