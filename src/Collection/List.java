package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class List 
{
public static void main(String[] args)
 {
   ArrayList list =  new ArrayList();
   list.add(10);
   list.add(20);
   list.add(30);
   list.add(40);
   list.add(40);
   
   System.out.println(list);
   
   Iterator itr = list.iterator();
 
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
 }
}