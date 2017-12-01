import java.io.*;
class node
{
int data;
node prev,next;
public node(int x)
{
    data=x;
next=null;
}
}
  class SLL
   {
node start=null;    
public void insertFirst(int x)
{
if (isEmpty())
{
    node p=new node(x);
    start=p;        
}
else
{
    node p=new node(x);
    p.next=start;
    start=p;
}
}

public boolean isEmpty()
{
if(start==null)
        return true;
else
        return false;
}
    
    public int removeLast()
   {
    if (isEmpty())
    {
           System.out.println("empty");
            return 0;
    }
    else
    {
            node current=start;
              while (current.next.next!=null)
                current=current.next;
            int x=current.next.data;
            current.next=null;
            return x;   
        }
    }
    
    public void removeAllBasedOnValue(int val)
    {
     if (isEmpty())
     {
            System.out.println("empty");
           //  return 0;
     }
     else 
     {
             node current=start;
             node last = start;
             while (last!=null)
             {
            	 current = last;
            	if(current.data>val){
            		System.out.println("Removed from list:"+current.data);
            		current.data=-1;
              	}
               last = last.next;
             }
            
          }
     }
    
    
    public void display()
    {   
    if (isEmpty())
    System.out.println("The list is empty");
    else
    {
        node current=start;
    while (current!=null)
    {
    	if(current.data!=-1)
        System.out.print(current.data+" ");
        current=current.next;
    }
    }
    }
}
public class Sl 
{
  public static void main(String[] args) throws IOException
  {
  InputStreamReader obj=new InputStreamReader(System.in);
  BufferedReader r=new BufferedReader(obj);
  int ch;
    SLL s=new SLL();
   do
   {
            System.out.println("1.Insert");
            System.out.println("2.Remove");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            ch=Integer.parseInt(r.readLine());
            switch (ch)
            {
            case 1:
                System.out.println("1.Insert element");
                System.out.println("Enter your choice:");
                int al=Integer.parseInt(r.readLine());
                switch (al)
                {
                       
              case 1:
                            System.out.println("Enter an element");
                            int y=Integer.parseInt(r.readLine());
                            s.insertFirst(y);
                            break;
           
                    }
                    break;
        case 2:
                    System.out.println("1.Remove tail");
                    System.out.println("2.Remove all elements based on specific value");
                    System.out.println("Enter choice:");
                    int al1=Integer.parseInt(r.readLine());
                    switch (al1)
                    {
                        
            case 1:
                        System.out.println("deleted: "+s.removeLast());
                        break;
            /*case 2:
                System.out.println("deleted: "+s.removeAllBasedOnValue(val));
                break;*/
            case 2:
                System.out.println("Enter the element:");
                int val=Integer.parseInt(r.readLine());
                s.removeAllBasedOnValue(val);
                break;
            
                    }
                    break;
        
        case 3:
                    s.display();
                    break;
        case 4:
                    break;
            }
    }while(ch!=4);
    }
}