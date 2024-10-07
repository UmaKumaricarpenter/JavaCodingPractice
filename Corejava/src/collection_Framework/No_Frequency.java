package collection_Framework;

import java.util.HashMap;

import java.util.Map;

public class No_Frequency {
	
    public static void main(String[] args) {
		
		//Find frequency of each element from integer array in java.
	
		int[] numbers1 = {1,2,4,5,6,3,2,5,2,1,4,6,3,1,1};
		
		HashMap<Integer,Integer>map= new HashMap<>();
		
		for(int i = 0; i<numbers1.length; i++) {
			
			if(map.containsKey(numbers1[i])){
				
				map.put(numbers1[i],map.get(numbers1[i])+1);
				 
			}
			else {
				map.put(numbers1[i],1);
			}
		
		}
		//	map.put(numbers1[i], map.getOrDefault(numbers1[i], 0) + 1);(Singal line logic)
			
		for(Map.Entry<Integer, Integer>  ekPair : map.entrySet()) {
				
			System.out.println(ekPair.getKey() +"--->" +ekPair.getValue());
				
		}
		
		System.out.println("------------------------------------------------------------------");
				
        int[] numbers = {1,2,4,5,6,3,2,5,2,1,4,6,3,1,1};
		
		  Map<Integer,Integer>frequency= new HashMap<>(); 
		
	      for(int number : numbers) {
	    	  
		    	frequency.put(number,frequency.getOrDefault(number,0)+1);
	      } 
		
		  for(Map.Entry<Integer,Integer>entry  : frequency.entrySet()) {
			  
			  System.out.println("Number:" +entry.getKey()+ ", frequency: "+entry.getValue());
		  }
		
	}
		

}
