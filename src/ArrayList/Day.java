package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Day {
	
	public static void main(String[] agrs){
//		Set<String> day = new HashSet<String>();
		Map<String,String> day = new HashMap<String,String>();
		
//		day.add("Monday");
//		day.add("Tuesday");
//		day.add("Wednesday");
//		day.add("Thursday");
//		day.add("Friday");
//		day.add("Saturday");
//		day.add("Sunday");
		
		day.put("mon","Monday");
		day.put("tue","Tuesday");
		day.put("wed","Wednesday");
		day.put("thu","Thursday");
		day.put("fri","Friday");
		day.put("sat","Saturday");
		day.put("sun","Sunday");
//		Collections.sort(day);
//		Iterator<String> itr = day.iterator();
//		Set days = day.entrySet();
		Iterator<String> itr = day.keySet().iterator();
		
//		while(itr.hasNext()){
//			String key = (String)itr.next();
//			String val = day.get(key);
//			System.out.println("Key : " + key +" Day : " + val);
////			System.out.println("Day : " + itr.next());
//		}
		
		for(Map.Entry<String, String> entry : day.entrySet()){
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println("Key : " + key +" Day : " + value);
		}
//		for(String str : day){
//			System.out.println("Day : " + str);
//		}
		
		
//		for(int i=0;i<day.size();i++){
//			System.out.println("Day : " + day.);
//		}
	}

}
