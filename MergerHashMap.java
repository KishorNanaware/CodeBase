package myPack;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MergerHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map1= new HashMap<Integer,String>();
		map1.put(1, "vijay");
		map1.put(2, "Ganesh");
		map1.put(3, "Harsh");
		map1.put(4, "ODD");
		
		Map<Integer,String> map2= new HashMap<Integer,String>();
		map2.put(1, "vijay2");
		map2.put(2, "Ganesh2");
		map2.put(3, "Harsh2");
		
		map2.forEach((key,value)
		->map1.merge(key, value, (v1,v2)->v1.equalsIgnoreCase(v2)
				?v1
				:v1+" ,"+v2));
		
		System.out.println("Merged Map "+map1);
	}
}
