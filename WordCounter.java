import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) throws FileNotFoundException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("enter the file path: ");
		Scanner sc = new Scanner(System.in);
		String path=sc.next();
		//Scanner txtFile = new Scanner(new File("D:\\internship\\hello.txt"));
		Scanner txtFile = new Scanner(new File(path));
		while(txtFile.hasNext()) {
			String word=txtFile.next();
			if(map.containsKey(word)) {
				int count= map.get(word)+1;
				map.put(word, count);
			}
			else {
				map.put(word,1);
			}
			
		}
		txtFile.close();
		sc.close();
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println(entry);
		}
		

	}

}
