package quest4;
import java.io.*;
import java.util.*;


public class ShowBiggest {
	
	
		BufferedReader br;
		private ArrayList<Double> doubles=new ArrayList<>();
		
		public ShowBiggest()
		{
		init();	
		}
		
		void init()
		{
			try {
				double doubleValue;
				br= new BufferedReader(new FileReader(new File("C:\\Users\\chira\\OneDrive\\Desktop\\Divya Sahu\\data.txt")));
				String str = null;
				while ((str = br.readLine()) != null) {
				doubleValue=Double.parseDouble(str);
				doubles.add(doubleValue);
				}
				
				double biggestOne = 0;
				for(int i=1;i<doubles.size();i++)
				{
					biggestOne=doubles.get(0);
					if(biggestOne<=doubles.get(i))	biggestOne=doubles.get(i);
				}
				System.out.println("Biggest One : "+biggestOne);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		}
	}

