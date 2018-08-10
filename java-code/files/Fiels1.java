//Lesson 31
// Java File Class
//https://www.youtube.com/watch?v=o9F73FU2vzs&index=31&list=PLE7E8B7F4856C9B19
package files;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.io.*;
import javax.swing.*;


public class Fiels1 extends JFrame{
 
 public static final int FONT_SIZE = 90;		
 Dimension d = new Dimension(FONT_SIZE*4 ,FONT_SIZE*1 );
 Font font = new Font("Arial", Font.BOLD, FONT_SIZE *2/3);

 static String filePath,parentDirectory;
 static File randomDir, randomFile, randomFile2;
 
 public static void main(String[] args){
		
  // Creates a File object in memory
   //randomDir = new File("C:/Users/normi/d/java/prj/Random");
  randomDir = new File("C:/Users/normi/d/java/prj/Random");
	 
  // Make a directory
 randomDir.mkdir();
		
 // Make a file named random.txt
 randomFile = new File("random.txt");
		
 // Make a file and define where to save it in the file system
 randomFile2 = new File("C:/Users/normi/d/java/prj/Randomrandom2.txt");
		
 // createNewFile and getCanonicalPath have to be called in 
 // a try block to catch IOException
 try {
   // createNewFile creates the file in the file system
   randomFile.createNewFile();
   randomFile2.createNewFile();
			
   // Returns the path for the file
   filePath = randomFile.getCanonicalPath();
   System.out.println("getCanonicalPath() =  "+ filePath); 
  } catch (IOException e) { 
	  // You have to catch the IOException
    e.printStackTrace();//print the error
 }
		
 // Check to see if the file exists in the current directory
 if (randomFile.exists()){
  System.out.println("File Exists");
  System.out.println("File is readable: " + randomFile.canRead());
  System.out.println("File is writable: " + randomFile.canWrite());
  System.out.println("File location: " + filePath);
  System.out.println("File name: " + randomFile.getName());
			
 // Since you created the file without defining a 
  //path this returns null
 System.out.println("Parent directory: " + randomFile.getParent());
			
 // This returns the parent because it was defined
 parentDirectory = randomFile2.getParent();
 System.out.println("File Two Parent Directory: " + parentDirectory);
 System.out.println("Is this a directory: " + randomDir.isDirectory());
			
 // list provides a string array containing all the files
 String[] filesInDir = randomDir.list();
 System.out.println("Files in Random Directory\n");
			
 // Use the enhanced for loop to cycle through the files
 for(String fileName : filesInDir){
	 System.out.println("   "+fileName + "\n");
  }
			
 System.out.println("Is this a file: " + randomFile.isFile());
 System.out.println("Is this hidden: " + randomFile.isHidden());
			
 // Milliseconds since Jan 1, 1970 when modified
 System.out.println("Last modified: " + randomFile.lastModified());
			
 // Return size of file
 System.out.println("Size of file: " + randomFile.length());
			
 // Changes the name of the file
 randomFile2.renameTo(new File("C:/Users/normi/d/java/prj/Random/random3.txt"));
			
 //Output the full path for the file unless the path 
 // wasn't defined when the File was created
 System.out.println("New Name: " + randomFile2.toString());
			
  new Fiels1();
 
 
			
 }//if (randomFile.exists())
  else {
		 System.out.println("File Doesn't Exist");
 	}
		
 // You call delete to delete a file
 if(randomFile.delete()){
			System.out.println("File Deleted");
		}
		
 // I could get an array of File objects from the directory
   File[] filesInDir = randomDir.listFiles();
  for(File fileName : filesInDir){
			fileName.delete();
		}
		
 // You can only delete a directory if it is empty
   if(randomDir.delete()){
			System.out.println("Directory Deleted");
		}
}//main
 public void setFileChooserFont(Component[] comp)
 {
   for(int x = 0; x < comp.length; x++)
   {
     if(comp[x] instanceof Container) setFileChooserFont(((Container)comp[x]).getComponents());
     try{comp[x].setFont(font);}
     catch(Exception e){}//do nothing
   }
 }	
 public Fiels1(){
    // Creates a file chooser at the location specified
   JFileChooser fc = new JFileChooser(randomDir);
   fc.setPreferredSize(new Dimension(800, 600));	
   setFileChooserFont(fc.getComponents());
    
   // Opens the file chooser
   fc.showOpenDialog(this);
 }
 	
}//public class Fiels1 extends JFrame