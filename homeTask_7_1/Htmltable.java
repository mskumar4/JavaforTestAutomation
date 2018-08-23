package homeTask_7_1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Htmltable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D://Htmltable_task.html");
			if(file.exists()){
			System.out.println("File already exist and size of the file is : "+file.length());
			}
			else{
			FileWriter fileWriter = null;
			BufferedWriter bufferedWriter = null;
			try {
			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);

			String htmlPage = "<!DOCTYPE html> <html> <head> <title>Practice Html Table</title> </head> <body> <br><br><br> <h1>Home Task 7_1</h1> <br><br><br> <div> <table> <thead> <tr> <th>Name</th> <th>Type</th> <th>Creation Date</th> <th>Size (in Kb)</th> </tr> </thead> <tbody> <tr> <th>Dir1</th> <th>DIR</th> <th>01.02.2005</th> <th>235235</th> </tr> <tr> <th>Dir2</th> <th>DIR</th> <th>02.03.2006</th> <th>45254353</th> </tr> <tr> <th>file1.ext</th> <th>FILE</th> <th>01.01.2001</th> <th>23</th> </tr> <tr> <th>file2.ext</th> <th>FILE</th> <th>02.02.2002</th> <th>234</th> </tr> </tbody> </table> </div> </body> </html>" ;

			bufferedWriter.write(htmlPage);


			System.out.println("Html page created"); 
			bufferedWriter.flush();
			fileWriter.flush();

			} 
			catch (IOException e) {
			
			e.printStackTrace();
			}
			
			try {

			bufferedWriter.close();
			fileWriter.close();
			} 
			catch (IOException e) {
			
			e.printStackTrace();
			}

			System.out.println("The size of the file is : "+file.length());
			}
			
			
			}
	}


