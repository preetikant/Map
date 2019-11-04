 import java.util.*;
 public class HashMapDemo{
 	public static void main(String[] args) {
 		HashMap m = new HashMap();
 		m.put("hi",300);
 		m.put("hello",900);
 		m.put("bye",88);
 		m.put("chaye",899);
 		//print to HashMap
 		System.out.println(m);
 		//Override to one key values
 		System.out.println(m.put("hi",1000));
 		//print the all set value
 		Set s = m.keySet();
 		System.out.println(s);
 		//print all values
 		Collection c = m.values();
 		System.out.println(c);
 		//print entry set
 		Set s1 = m.entrySet();
 		System.out.println(s1);
 		Iterator itr = s1.iterator();
 		while(itr.hasNext()){
 			Map.Entry m1 = (Map.Entry)itr.next();
 			System.out.println(m1.getKey()+"---"+m1.getValue());
 			if(m1.getKey().equals("hi"))
 			{
 				m1.setValue(10000);
 			}
 		}
 		System.out.println(m);
 	}
 }