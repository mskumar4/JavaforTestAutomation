package com.epam.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//Task7_1
public class Table7_1 {
	
	private static final String DIR="DIR";
	private static final String FILE="File";
	private static String TAG="</td><td>";
	static Logger logger = Logger.getLogger(Table7_1.class);

	public static void main(String args[]) { 
		String log4jConfigFile = System.getProperty("user.dir")+"/src/Resources/"+ File.separator + "log4j.properties";
        PropertyConfigurator.configure(log4jConfigFile);
		//listFilesAndFolders("D:\\test"); //provide the folder to get files and subfoder
		listFilesAndFolders("dfd");
	}
    public static void listFilesAndFolders(String directoryName){
    	
    	if (directoryName==null){
    		logger.info("Folder path "+directoryName+" does not exist");
    	}else{
	    	File directory = new File(directoryName);
	        File[] fList = directory.listFiles();
	        Map<String,List<String>> fileMap = new HashMap<String, List<String>>();
	        long fileSize;
	        int cntr=0;
	        String fileType;
	        if (fList==null){
	        	logger.info("Folder path "+directoryName+" does not exist");
	        }else{
		        
		        for (File file : fList){
		        	cntr++;
		        	try {
			            BasicFileAttributes attributes = Files.readAttributes(Paths.get(file.toURI()), BasicFileAttributes.class);
						FileTime fileTime = attributes.creationTime();
			            Date date = new Date(fileTime.toMillis());
			            SimpleDateFormat sdf = new SimpleDateFormat();
			            String dateWithoutTime = sdf.format(date);
			            if (attributes.isDirectory()){
			            	fileSize=getFolderSize(file);
			            	fileType=DIR;
			            }else{
			            	fileType=FILE;
			            	fileSize=file.length()/1024;
			            }   
			       	 	fileMap.put(Integer.toString(cntr),new ArrayList<String>());
			       	 	fileMap.get(Integer.toString(cntr)).add(file.getName());
			       	 	fileMap.get(Integer.toString(cntr)).add(dateWithoutTime);
			       	 	fileMap.get(Integer.toString(cntr)).add(Long.toString(fileSize));
			       	 	fileMap.get(Integer.toString(cntr)).add(fileType);	
			        }catch (IOException e) {
					e.printStackTrace();
			        }
		        }
		        createTable(fileMap);
	        }
    	}
   }
   
   
public static void createTable(Map<String, List<String>> fileMap){
	   Set keys = fileMap.keySet(); 
       StringBuilder buf = new StringBuilder();
   	buf.append("<html>" +
   	           "<body>" +
   	           "<table border=1>" +
   	           "<tr>" +
   	           "<th>Name</th>" +
   	           "<th>Type</th>" +
   	           "<th>CreationDate</th>" +
   	           "<th>Size (in Kb)</th>" +
   	           "</tr>");
   	 for (Iterator  fileCntr= keys.iterator(); fileCntr.hasNext(); ) {
            String key = (String) fileCntr.next();
             buf.append("<tr><td>");
 	       	 buf.append(fileMap.get(key).get(0));
 	       	 buf.append(TAG);
 	       	 buf.append(fileMap.get(key).get(3));
 	       	 buf.append(TAG);
 	       	 buf.append(fileMap.get(key).get(1));
 	       	 buf.append(TAG);
 	       	 buf.append(fileMap.get(key).get(2));
	       	 buf.append("</td></tr>");
   	 }
   	 buf.append("</table>" +
 	           "</body>" +
 	           "</html>");
   	 String html = buf.toString();
   		WriteToFile(html,"FolderContent.html");
       
   }
 
    public static long getFolderSize(File dir) {
        long size = 0;
        if (!(dir.listFiles()==null)){
	        for (File file : dir.listFiles()) {
	            if (file.isFile()) {
	                size += file.length();
	            }
	            else
	                size += getFolderSize(file);
	        }
	    }
        return size;
    }
  
    public static void WriteToFile(String fileContent, String fileName) {
        String projectPath = System.getProperty("user.dir");
        String tempFile = projectPath + File.separator+fileName;
        File file = new File(tempFile);
        try {
	        if (file.exists()) {
                File newFileName = new File(projectPath + File.separator+ "bkp_"+fileName);
                file.renameTo(newFileName);
                file.createNewFile();
        }
        OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
        Writer writer=new OutputStreamWriter(outputStream);
	    writer.write(fileContent);
	    writer.close();
        } catch (IOException e) {
            e.printStackTrace();
         }

    }
}
