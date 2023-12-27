
public class LinkedLists{

    Node head;

    public void insert(int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else{

            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }

    }
    
    public void insertAtStart(int data)
    {
        Node node=new Node();
        // System.out.println(node.data);
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
    }

    public void insertAt(int index, int data)
    {
        Node node=new Node();
        node.data=data;
        node.next=null;
        
        if(index==0)
        {
           node.next=head;
           head=node;
        //    return;

        }
        else
        {
            Node n=head;
            
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }

    }

    public void show()
    {
        System.out.println("The linked list using just head: ");
        Node node=head;
        while(node.next!=null)
        {
            System.out.print(node.data);
            node=node.next;
        }
        System.out.print(node.data);

    }
    
    public void deleteAt(int index)
    {
        if(index==0)
        {
            head=head.next;
        }
        else
        {
            Node n= head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            System.out.println("n1 to be deleted is:"+n1.data);
            n.next=n1.next;
            n1=null;
        }
    }
    
}

