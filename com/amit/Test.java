package com.amit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		
		Map<String, String> countryCapitalMap=new HashMap<>();  
        countryCapitalMap.put("india","Delhi");  
        countryCapitalMap.put("japan","Tokyo");  
        countryCapitalMap.put("france","Paris");  
        countryCapitalMap.put("russia","Moscow"); 

     Map<String, String> sortedMap=   countryCapitalMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

 sortedMap.forEach((key,value)->{
System.out.println(key+" "+value);

 });

	}

}
