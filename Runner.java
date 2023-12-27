
public class Runner {

    public static void main(String[] args) {
        LL ls=new LL();

        // LL first= new LL();
        // LL second=new LL();


        // first.insertLast(1);
        // first.insertLast(2);
        // first.insertLast(4);
        

        // second.insertLast(1);
        // second.insertLast(3);
        // second.insertLast(4);

        // LL ans=LL.merge(first,second);

        // ans.display();
        
        
        ls.insertLast(5);
        ls.insertLast(24);
        ls.insertLast(30);
        ls.insertLast(32);
        ls.insertLast(40);
        ls.display();

        ReverseLinked rs=new ReverseLinked();
        Node rvrshead=rs.reverse(ls.head);
        ls.head=rvrshead;
        ls.display();

       
    }
    
}
