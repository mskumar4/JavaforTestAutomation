package com.epam.test;

import java.util.Arrays;
import java.util.List;


public class FilterStringAProblem 
{

	public static void main(String[] args) 
	{
		List<String> arrList = Arrays.asList("Apple", "Ant", "Bat", "Baloon","Egg", "Eagle","Fish");
        arrList.stream()
        .filter((p) -> p.startsWith("A"))  
        .filter(p -> p.length()==3)       
        .forEach((p) -> System.out.println(p));

	}

}
