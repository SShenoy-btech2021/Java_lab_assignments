import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class UserInput {
Scanner sc=new Scanner(System.in);  
public String [] createArray(){ 
int n;  

System.out.println("Enter the number of elements you want to store: ");  
//reading the number of elements from the that we want to enter  
n=Integer.parseInt(sc.nextLine());  
System.out.println("\n");
//creates an array in the memory of length 5 
String[] array = new String[4];  
for (int i=0;i<n;)
{
    System.out.println("Enter the "+i+" element\n");
    array[i]=sc.nextLine();
    i++;
}

return array;
}
public ArrayList<String> createAlist(){
  
    System.out.println("Enter the number of elements you want in array list ");
    int m=Integer.parseInt(sc.nextLine());



    ArrayList <String> ArrayList= new ArrayList<String>();

    for (int i=0;i<m;i++)
    {   
        System.out.println("Enter the"+i+"th element");
        String s= sc.nextLine();

        ArrayList.add(s);
    }
    return ArrayList;
}


    
}
