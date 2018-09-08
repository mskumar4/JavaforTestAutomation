package com.epam.test;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Table_Task8 {
	private static Map<String, ArrayList<String>> fileMap = new HashMap<String, ArrayList<String>>();
	static Logger logger = Logger.getLogger(Table_Task8.class);
	public static void geFolderDetails(File[] arr, int level)  {
         for (File f : arr) 
         {
	             if(f.isFile()){ 
	                if (!fileMap.containsKey(f.getParent())){
	                	fileMap.put(f.getParent(),new ArrayList<String>());
	                }
	                fileMap.get(f.getParent()).add(f.getName());
	         }else if (f.isDirectory()) { 
	            	 level++;
	            	 geFolderDetails(f.listFiles(), level); 
	         } 
         }
    }
	     
    public static void main(String[] args)
    {
    	
    	String log4jConfigFile = System.getProperty("user.dir")+"/src/Resources/"+ File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
        String dirPath = "D:\\Test"; 
        // File object
        File dir = new File(dirPath);    
        if(dir.exists() && dir.isDirectory())
        {
            File[] arr = dir.listFiles();
            geFolderDetails(arr, 0); 
       } 
       for (Entry<String, ArrayList<String>> entry: fileMap.entrySet()) {
    	   String tab="";
    	   String key=entry.getKey();
        	String []folder=key.split("\\\\");
        	for (int tabCntr=1; tabCntr<folder.length-1;tabCntr++)
        		tab=tab+"\t";
        	logger.info(tab+"["+folder[folder.length-1]+"]");
        	for (int fileCntr=0; fileCntr<fileMap.get(key).size();fileCntr++){
        		logger.info(tab+fileMap.get(key).get(fileCntr));
        	}
        }
    }
}

