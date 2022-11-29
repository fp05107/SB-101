package Map1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 1, 2, 3, 4, 5, 6, 6, 6, 6 };

//		Map<Integer, String> hm = new HashMap<>();
		
		Map<Integer, Integer> hm = new HashMap<>();
		hm.put(2, 4);
		System.out.println(hm.get(2)+1);
		for(int i=0;i<arr.length;i++) {
			int x = arr[i];
			if(hm.get(x)!=null) {
				
				hm.put(x,hm.get(x)+1);
			}else {
				hm.put(x, 1);
			}
		}
//		System.out.println(hm);
//		hm.put(1, "one");
//		hm.put(1, "one");
//		hm.put(2, "two");
//		hm.put(3, "three");
//		hm.put(4, "four");
//		hm.put(5, "five");
//		System.out.println(hm);
//		Collection<String> keys = hm.values();
//		for(String x:keys){
//		System.out.println(x);
//		}

//		Set<Map.Entry<Integer, String>> keyValue = hm.entrySet();
//		System.out.println(keyValue);
//		for (Map.Entry<Integer, String> me : keyValue) {
//			System.out.println(me.getKey() + "======" + me.getValue());
//		}
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(12);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
	}
}
