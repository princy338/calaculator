package practisejava;
import java.io.BufferedReader;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Filehandling {
	    public static void main(String args[]) throws FileNotFoundException, IOException {
	        System.out.println("Please select one of the below operations");
	        System.out.println(" W for write, R for Read, A for append ");
	        Scanner in =new Scanner(System.in);
	        String s=in.nextLine();
	        if(s.equalsIgnoreCase("R"))
	        {
	            new FReading();
	        }
	        else if(s.equalsIgnoreCase("W")||s.equalsIgnoreCase("A"))
	        {
	            writingToFile(s);
	            
	            
	        }
	        else
	        {
	            System.out.println("betterluck next time Try again ");
	        }
	        
	        
	        in.close();
	        
	    }
	    
	    public static void writingToFile(String s)
	    {
	        Scanner in=null;
	        try
	        {
	            String source = "";
	            File f=new File("files.txt");
	            
	            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	            FileWriter n =null;
	            if(s.equalsIgnoreCase("w"))
	            {
	                n = new FileWriter(f,false);
	                System.out.println("it will overwrite the content inside the file ");
	                System.out.println("Type 'n' to exit");
	                System.out.println("Do you want to proceed :type 'y' ");
	                in=new Scanner(System.in);
	                String s1=in.nextLine();
	                if(s1.equals("n"))
	                System.exit(0);
	                System.out.println("Write 'DONE' when you finish writing file ");
	                f.delete();
	                f.createNewFile();
	                while(!(source=bf.readLine()).equalsIgnoreCase("DONE")){
	                    n.write(source + System.getProperty("line.separator"));
	                    
	                }
	                
	                in.close();
	            }
	
	            else
	            {  n = new FileWriter(f,true);
	                System.out.println("Write 'DONE' when you finish appending file ");
	                while(!(source=bf.readLine()).equalsIgnoreCase("DONE")){
	                    n.append(source+ System.getProperty("line.separator"));
	                }
	            }
	            n.close();
	            
	        }
	        catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	        
	        
	    }
	    
	    
	    
	}

	class FReading {
	    public static String str="";
	    
	    public FReading() {
	        
	        try{
	            File f5=new File("files.txt");
	            if(! f5.exists())
	            f5.createNewFile();
	            FileReader fl=new FileReader(f5);
	            BufferedReader bf=new BufferedReader(fl);
	            while((str=bf.readLine())!=null){
	                System.out.println(str);
	            }
	            fl.close();
	            }catch(Exception e){
	            System.out.println("Error : " );
	            e.printStackTrace();
	        }
	    }
	}
