import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {
public static void main(String[] args) {
	HashSet<String> myHashSet = new HashSet<String>();
	
	myHashSet.add("Vinit");
	myHashSet.add("Himanshu");
	myHashSet.add("Vinit");
	myHashSet.add("Prashant");
	myHashSet.add("Himanshu");
	myHashSet.add("Vinit");
	
	Iterator<String> myItr = myHashSet.iterator();
	
	while( myItr.hasNext())
	{
		System.out.println("HashSet Example = "+myItr.next());
	}
}
}
