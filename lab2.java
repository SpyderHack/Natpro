/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
// Java code for serialization and deserialization 
// of a Java object 
import java.io.*; 

class Demo implements java.io.Serializable 
{ 
	public int age; 
	public String name; 

	// Default constructor 
	public Demo(int age, String name) 
	{ 
		this.age = age; 
		this.name = name; 
	} 

} 

class Test 
{ 
	public static void main(String[] args) 
	{ 
		Demo object1 = new Demo(23, "Sita"); 
                Demo object2 = new Demo(24, "Gita"); 
                
		String filename1 = "file1.txt";
                String filename2 = "file2.txt";
                
		
		// Serialization 
		try
		{ 
			//Saving of object in a file 
			FileOutputStream file1 = new FileOutputStream(filename1); 
			ObjectOutputStream out1 = new ObjectOutputStream(file1);
                        
                        FileOutputStream file2 = new FileOutputStream(filename2); 
			ObjectOutputStream out2 = new ObjectOutputStream(file2);
			
			// Method for serialization of object 
			out1.writeObject(object1); 
			
			out1.close(); 
			file1.close(); 
                        
                        out2.writeObject(object2); 
			
			out2.close(); 
			file2.close(); 
			
			System.out.println("Object has been serialized"); 

		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 


		Demo object11 = null; 
                Demo object12= null;

		// Deserialization 
		try
		{ 
			// Reading the object from a file 
			FileInputStream file1 = new FileInputStream(filename1); 
			ObjectInputStream in1 = new ObjectInputStream(file1); 
			
			// Method for deserialization of object 
			object1 = (Demo)in1.readObject(); 
			
			in1.close(); 
			file1.close(); 
			
			System.out.println("Object has been deserialized "); 
			System.out.println("a = " + object1.age); 
			System.out.println("b = " + object1.name); 
                        
                        // Reading the object from a file 
			FileInputStream file2 = new FileInputStream(filename2); 
			ObjectInputStream in2 = new ObjectInputStream(file2); 
			
			// Method for deserialization of object 
			object2 = (Demo)in2.readObject(); 
			
			in2.close(); 
			file2.close(); 
			
			System.out.println("Object has been deserialized "); 
			System.out.println("a = " + object2.age); 
			System.out.println("b = " + object2.name); 
		} 
		
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 
		
		catch(ClassNotFoundException ex) 
		{ 
			System.out.println("ClassNotFoundException is caught"); 
		} 

	} 
} 

//public class lab2 {
    
//}
