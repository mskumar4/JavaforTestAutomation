package com.epam.JSON;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;


public class JSON_Main{ 

public static void main(String [] args)
{
	POJO pojo = new POJO(); 
	pojo.setId(1);
	pojo.setUserid(3456);
	pojo.setTitle("sunt aut facere repellat provident occaecati excepturi optio reprehenderit");
	pojo.setBody("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
	
	ObjectMapper mapper = new ObjectMapper();
	 try {
         mapper.writeValue(new File("result.json"), pojo);//Plain JSON
     } catch (Exception e) {
     	e.printStackTrace();
     }
	 
	}

}

	
	
	
