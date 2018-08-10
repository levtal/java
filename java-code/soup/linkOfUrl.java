 /*
  * Print the total links of an URL. To do so, we are going 
  * to call select() method of Document class that returns the
  * reference of Elements. The Elements class have elements that
  * can be traversed by for-each loop. 
  * The Element class provides attr() and text() methods to 
  * return link and text of the link.
  http://www.javatpoint.com/jsoup-example-print-meta-data-of-an-url
  */
import java.io.IOException;  
import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;  
import org.jsoup.nodes.Element;  
import org.jsoup.select.Elements;  
public class linkOfUrl {  
 
 public static void main( String[] args ) throws IOException{  
     Document doc = Jsoup.connect("http://www.google.com").get();  
     Elements links = doc.select("a[href]");  
     for (Element link : links) {  
         System.out.println("\nlink : " + link.attr("href"));  
         System.out.println("text : " + link.text());  
       }  
}  
}  