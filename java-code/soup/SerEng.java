//https://jsoup.org/cookbook/extracting-data/selector-syntax
//Scrap  results og Google,yahoo,ask.com, bing

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class SerEng {
  
   static String srch= "PHP Simple HTML DOM";
   static String googleURL  = "http://www.google.com/search?hl=en&tbo=d&site=&source=hp&q="+srch;
   static String yahooURL = "https://search.yahoo.com/search?fr=yfp-t&fp=1&toggle=1&cop=mss&ei=UTF-8&p="+srch;
   static String askURL = "http://www.ask.com/web?o=0&qo=homepageSearchBox&q=q="+srch;
   static String bingURL = "https://www.bing.com/search?qs=n&form=QBLH&sp=-1&pq=asad&sc=8-4&sk=&q="+srch;
   //static String URL  = "http://www.google.com/search?hl=en&tbo=d&site=&source=hp&q="+srch;
   static Document doc;
  
  
  
  public static void EngScan(String url,String lTg, String tTg , String dTg ){
   try {  
	    doc = Jsoup.connect(url).get();
	    Elements Href  = doc.select(lTg); //href 
	    Elements Title = doc.select(tTg ); //Title   
	    Elements desc  = doc.select(dTg);//item-abstract"
	    System.out.println("------------- \n Number of items :" + Title.size());
        for (int i=1;i<=Title.size(); i++){
	    // output headline, link and description 
	         System.out.println("["+i + "] " + Title.get(i-1).text());    
	         System.out.println( "  " + Href.get(i-1).attr("href"));
	         System.out.println( "  " + desc.get(i-1).text());
	    } 	
	  }  catch (Exception e){
		  System.out.println("Error retrieving from url [" + e.getMessage()+"]");
	  }
  }//EngScan
  
    
  
 public static void main(String[] args) throws IOException {
	 String TitleTag, HrefTag,descTag;  
	 
  System.out.println("\n Search string :"+srch+"\n------------\n\n");
	 
  System.out.println("Google\n");
  TitleTag =  "h3 a[href]" ; //Title   
  HrefTag  = "h3 a[href]" ; //href 
  descTag  = ".st" ; // 
  EngScan(googleURL,TitleTag, HrefTag,descTag );  
	  
 System.out.println("\nYAHOO");  
 TitleTag =  "h3  a" ; //Title   
 HrefTag  = "h3  a" ; //href 
 descTag  = ".lh-16" ; // 
 EngScan(yahooURL,TitleTag, HrefTag,descTag ); 
	    
	  
 System.out.println("\nASK");    
 TitleTag =  ".PartialSearchResults-item-title" ; //Title   
 HrefTag  = ".PartialSearchResults-item-title-link" ; //href 
 descTag  =  ".PartialSearchResults-item-abstract" ; // 
 EngScan(askURL,TitleTag, HrefTag,descTag );
 
 
 System.out.println("\nBing.com");    
 TitleTag =  "h2 a" ; //Title   
 HrefTag  = "h2 a span strong" ; //href 
 descTag  =  "div.b_caption p" ; // 
 EngScan(bingURL,TitleTag, HrefTag,descTag );
 
 
  }
}

 