package Java0624.Collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		
		List<Integer> asd = new ArrayList<Integer>();
		
		for (int a = 0; a<10; a++) {
			set.add("asd1" + "의읭이ㅡ이ㅡ이" + a);
		}

		for(String aa : set) { //향상된 for문을 통한 값 출력
			System.out.println(aa);
		}
		
		//---------------------------------------------------------------------
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) { //iterator을 통한 값 출력
			
			String str = iterator.next();
			System.out.println(str);
			
		}
		
	}
}
