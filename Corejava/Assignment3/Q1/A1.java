package a3;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

	public class A1 {

		public static void main(String[] args) {

			
			
			try {
				FileReader fr1=new FileReader("C:\Users\chira\Downloads\ronaldo - Google Search_files");
				FileWriter fw1=new FileWriter("C:\Users\chira\Downloads\ronaldo - Google Search_files");
				int i=0;
				while((i=fr1.read())!=-1) {
					fw1.write(i);
				}
				fw1.close();
				fr1.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
			System.out.println("file is written");
		}
	}
