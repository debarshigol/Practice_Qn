package Practice_Problrm;

import java.util.ArrayList;
import java.util.List;

public class MargeTWoListMod {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(33);
		list.add(2);
		list.add(81);
		list.add(1);
		list.add(9);
		
		List<Integer> listTwo  = new ArrayList<Integer>();
		listTwo.add(53);
		listTwo.add(73);
		listTwo.add(23);
		listTwo.add(31);
		listTwo.add(97);
		
		List<Integer> listSorted  = new ArrayList<Integer>();
		
		for (Integer num : list) {
			listSorted.add(num);
		}
		for (Integer num : listTwo) {
			listSorted.add(num);
		}
		
		listSorted.sort(null);
		System.out.println(listSorted);

	}

}
