import java.util.*;
class VectorDemo{
	public static void main(String... args){
		Vector<String>al=new Vector<>(3,2);
		System.out.println("ini"+al.capacity());
		System.out.println("size"+al.size());
		al.addElement("a");
		al.addElement("b");
		al.addElement("c");
		al.addElement("b");
		System.out.println("cap"+al.capacity());
		System.out.println("size"+al.size());
		al.removeElementAt(2);
		Enumeration<String>e1=al.elements();
		while(e1.hasMoreElements()){
			String s=e1.nextElement();
			System.out.print(s);
		}Iterator<String>e=al.iterator();
		while(e.hasNext()){
			String s=e.next();
			System.out.print(s);
		}al.trimToSize();
		System.out.println("\nCap"+al.capacity());
	}
}
