import java.util.*;
public class TreeMapDemo{
	public static void main(String[] args) {
		TreeMap m  = new TreeMap();
		m.put(102,"XXX");
		m.put(101,"YYY");
		m.put(109,"hi");
		m.put(103,"bye");
		System.out.println(m);
		//if we trying to print hetrogeneous value than we will get ClassCastException
		//m.put("VV","gye");
		//if we trying to print null than we will get NullPointerException
		//m.put(null,"heelo");

	}
}