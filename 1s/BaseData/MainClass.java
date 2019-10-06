/*
* @author Kochedykov Alexander
* 11-801
*/
import java.util.*;
import java.io.*;

public class MainClass {
	public static ArrayList <Name> names; 
	public static ArrayList <Size> sizes;
	public static ArrayList <Date> dates;

		public static String findNameById(int id) { 
			for(int i = 0; i < names.size(); i++) { 
				if (names.get(i).getId() == id) { 
					return names.get(i).getName(); 
				} 
			} 
				return null; 
		} 

		 public static String findSizeById(int id) { 
			for(int i = 0; i < sizes.size(); i++) {
				if (sizes.get(i).getId() == id) { 
					return sizes.get(i).getSize(); 
				} 
			} 
				return null; 
		}

		public static String findDateById(int id) { 
			for(int i = 0; i < dates.size(); i++) { 
				if (dates.get(i).getId() == id) { 
					return dates.get(i).getDate(); 
				} 
			} 
				return null; 
		}
	

	public static void main(String [] args) 

        throws IOException {

        	
			Scanner sc0 = new Scanner(new File("Name.txt")); 
			names = new ArrayList<>(); 
				while (sc0.hasNextLine()) { 
				String[] data = sc0.nextLine().split("\t"); 
				Name n = new Name(Integer.parseInt(data[0]), data[1]); 
				names.add(n); 
				}

				Scanner sc2 = new Scanner(new File("Size.txt")); 
				sizes = new ArrayList<>(); 
					while (sc2.hasNextLine()) { 
						String[] data = sc2.nextLine().split("\t"); 
						Size s = new Size((Integer.parseInt(data[0])), data[1]); 
						sizes.add(s); 
					} 
			Scanner sc3 = new Scanner(new File("Date.txt")); 
				dates = new ArrayList<>(); 
					while (sc3.hasNextLine()) { 
						String[] data = sc3.nextLine().split("\t"); 
						Date d = new Date(Integer.parseInt((data[0])), data[1]); 
						dates.add(d); 
					} 

        	
			Scanner sc1 = new Scanner(new File("document.txt"));
        	ArrayList <Documents> documents = new ArrayList<>();
        		while (sc1.hasNextLine()) {
        			String [] data = sc1.nextLine().split("\t");
        			Documents d = new Documents (findNameById(Integer.parseInt(data[0])), findSizeById(Integer.parseInt(data[1])), findDateById(Integer.parseInt(data[2])));
        			documents.add(d);
        		}
			

	System.out.println(documents);
	} 

}


