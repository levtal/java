
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

 
//https://www.youtube.com/channel/UCpLtXHkNop3XLf9lHNswEqw
//https://www.youtube.com/watch?v=7Y_LwipGthU
public class Wikis {
   private static final String URL ="https://en.wikipedia.org/wiki/Main_Page";

   public static void main(String[] args) throws IOException {
    
	 try {
	      Document doc = Jsoup.connect(URL).get();
        //  Get headline from 'doc'  and print each one in a sperate  line
	     Elements elm = doc.select("#mp-itn li");
	    for (int i=1;i<=elm.size(); i++){
			System.out.println(i + " :" + elm.get(i-1).text());
		}
	 }
	 catch (Exception e){
		  System.out.println("Error retrieving from url " + e.getMessage());
	  }
		
   }

}