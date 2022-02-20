// Java program to demonstrate iterators references

// Importing required classes from java.util package
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

// Main class
public class Main {

	// Main driver method
	public static void main(String[] args)
	{
		// Creating an object of Vector class
		Vector v = new Vector();

		// Creating three iterators
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();

		// Print class names of iterators
		// using getClass() and getName() methods
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}
}

