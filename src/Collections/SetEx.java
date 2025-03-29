package Collections;

import java.util.Iterator;
//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {

		// Set<Integer> list = new HashSet<Integer>();//-> hashset->no duplicate
		// elements
		Set<Integer> list = new TreeSet<Integer>();// -> sorted elements
		list.add(8);
		list.add(80);
		list.add(78);
		list.add(88);
		list.add(28);
		list.add(28);

		Iterator<Integer> values = list.iterator();
		while (values.hasNext()) {
			System.out.println(values.next());
		}

		for (int lists : list) {
			System.out.println(lists);
		}

	}
}
