import java.util.*;

public class CollectionArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<String> list = new ArrayList<String>();
     list.add("Pavan");
     list.add("Prathibha");
     list.add("Anvitha");
     
     Iterator<String> it = list.iterator();
     while(it.hasNext()){
    	 System.out.println("ArrayList Elements " + it.next());
     }
	}

}
