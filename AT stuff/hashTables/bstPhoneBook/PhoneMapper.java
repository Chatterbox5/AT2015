package bstPhoneBook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class PhoneMapper {

	private HashMap<Integer, LinkedList<PhoneEntry>> map;

	public PhoneMapper() {
		map = new HashMap<Integer, LinkedList<PhoneEntry>>();
		for (int i = 0; i < 10; i++) {
			map.put(i, new LinkedList<PhoneEntry>());
		}
	}

	public PhoneMapper(int numBuckets) {
		map = new HashMap<Integer, LinkedList<PhoneEntry>>();
		for (int i = 0; i < numBuckets; i++)
			map.put(i, new LinkedList<PhoneEntry>());
	}

	public void add(PhoneEntry rock) {
		int bucket = Math.abs(rock.hashCode()) % map.size();
		LinkedList<PhoneEntry> list = map.get(Math.abs(bucket));
		list.add(rock);
		list.sort(null);
		map.put(bucket, list);
	}

	public int getCapacity() {
		return map.keySet().size();
	}

	public int getSize() {
		int ret = 0;
		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			ret += map.get(i).size();
		}

		return ret;
	}

	public int getLongestList() {
		Set<Integer> keys = map.keySet();
		int ret = map.get(0).size();

		for (int i : keys) {
			if (map.get(i).size() > ret)
				ret = map.get(i).size();
		}

		return ret;
	}

	public int getNumNulls() {
		Set<Integer> keys = map.keySet();
		int ret = 0;

		for (int i : keys) {
			if (map.get(i).size() < 0)
				ret++;
		}

		return ret;
	}

	public String lookup(String name) {
		Set<Integer> keys = map.keySet();
		String ret = "";

		for (int i : keys) {
			LinkedList<PhoneEntry> list = map.get(i);
			for (PhoneEntry p : list) {
				if (p.getName().equals(name))
					return p.getNumber();
			}
		}

		return ret;
	}

	public String delete(String name) {
		return changeNumber(name, "");
	}


	public String changeNumber(String name, String number) {
		Set<Integer> keys = map.keySet();

		for (int i : keys) {
			LinkedList<PhoneEntry> list = map.get(i);
			for (PhoneEntry p : list) {
				if (p.getName().equals(name)) {
					p.setNumber(number);
					return number;
				}
			}
		}

		return number;
	}

	public String toString() {
		Set<Integer> keys = map.keySet();
		String ret = "";

		for (int i : keys) {
			ret +="LIST: " + map.get(i).toString() + "\n\n";
		}

		return ret;
	}

	public static void main(String[] args) throws IOException {

		PhoneMapper cm = new PhoneMapper();
		BufferedReader k = new BufferedReader(new FileReader(
				"hashTables/bstPhoneBook/phone (1).txt"));
		while (k.ready()) {

			String[] str = k.readLine().split("\t");
			PhoneEntry fred = new PhoneEntry(str[0], str[1]);
			cm.add(fred);
		}

		k.close();

		System.out.println(cm.toString());

		System.out.println("");

		System.out.println("The capacity is : " + cm.getCapacity());
		System.out.println("The size is : " + cm.getSize());
		System.out.println("The longest list is : " + cm.getLongestList());
		System.out.println("The Pope's number is : " + cm.lookup("Pope"));
		System.out.println("Pope's number will be changed");
		System.out.println("The Pope's number is : " + cm.changeNumber("Pope", "231231231"));
		
		System.out.println("Deleting Clevenger's Number" + cm.delete("Clevenger"));
		System.out.println(cm.toString());

	}

}