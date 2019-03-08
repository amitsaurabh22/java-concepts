package concorrentModification;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		// wrongUse();
		correctUse();

	}

	public static void wrongUse() {

		Set<String> set = new HashSet<String>();
		set.add("RP");
		set.add("VPLEX");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			boolean removed = set.remove(it.next());
			System.out.println("Removed:" + removed);

		}

	}

	public static void correctUse() {

		Set<String> set = new HashSet<String>();
		set.add("RP");
		set.add("VPLEX");

		Set<String> removedSet = new HashSet<String>();
		removedSet.addAll(set);
		Iterator<String> it = removedSet.iterator();
		while (it.hasNext()) {
			boolean removed = set.remove(it.next());
			System.out.println("Removed:" + removed);

		}

	}
}
