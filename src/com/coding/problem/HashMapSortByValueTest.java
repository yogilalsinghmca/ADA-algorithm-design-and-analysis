package com.coding.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapSortByValueTest {

	public static void main(String[] args) {

		String [] sweets = {"gulab-jamun", "laddu", "jalebi", "barfi","laddu", "gulab-jamun","gulab-jamun",
				"jalebi","gajar-halwa",	"gajar-halwa", "barfi", "gajar-halwa"};
		Map<String,Integer> map = new HashMap<>();
		for(String sweet:sweets){
			if(map.get(sweet)== null){
				map.put(sweet, 1);
			} else {
				map.put(sweet, map.get(sweet)+1);
			}
		}		
		System.out.println(findMaxVotedSweet(map));
	}




	public static String findMaxVotedSweet(Map<String,Integer> map){
		
		List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2)->{
		
		return -e1.getValue().compareTo(e2.getValue());
		}
		);
		
		int higestVote = list.get(0).getValue();
		Iterator<Map.Entry<String,Integer>> it = list.iterator();
		
		while(it.hasNext()){
			Map.Entry<String,Integer> entry = it.next();
			if(entry.getValue() < higestVote){
				it.remove();
			}			
		}// now sort by sweet name in reverse order
		Collections.sort(list, (Map.Entry<String,Integer> e1, Map.Entry<String,Integer> e2)->
		-e1.getKey().compareTo(e2.getKey()));
		return list.get(0).getKey();

	}
}

