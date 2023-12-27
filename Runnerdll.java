

public class Runnerdll {

    public static void main(String[] args) 
    {
        Dlist dl=new Dlist();
        dl.insertFirst(5);
        dl.insertFirst(7);
        dl.insertFirst(10);
        dl.insertLast(8);
        dl.insertLast(6);
        dl.insert(2, 2);
        dl.insert(34,6);
        dl.insertLast(33);
        //dl.insertafter(20, 3);
        dl.insertAfteri(33, 20);
        dl.display();

    }
    
}
