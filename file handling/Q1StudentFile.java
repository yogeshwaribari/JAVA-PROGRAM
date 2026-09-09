/*Question 1: Write a Java program to create a file student.txt and store student name and 
marks into it.
Asked In Practice Assignment
Input:
Enter student name: Rahul
Enter marks: 78

Output:
File created successfully.
Data written successfully.

Explanation:
Create file using FileWriter class with filename student.txt. Accept student name and marks 
from user using Scanner. Write name and marks to file using write() method separated by space. 
Close FileWriter properly using close() method to save data. FileWriter automatically creates new
 file if not exists and overwrites if already exists. Proper file closure ensures no data loss.*/
 import java.io.*;
import java.util.*;

class Q1StudentFile
{
    public static void main(String x[]) throws IOException
    {
        Scanner xyz=new Scanner(System.in);

        File f=new File("student.txt");

        boolean b=f.createNewFile();

        if(b)
        {
            System.out.println("File created successfully.");
        }
        else
        {
            System.out.println("File already exists.");
        }

        FileWriter fw=new FileWriter("student.txt");

        System.out.println("Enter Name");
        String name=xyz.nextLine();

        System.out.println("Enter Marks");
        int marks=xyz.nextInt();

        fw.write(name+ " " +marks);

        fw.close();

        System.out.println("Data written successfully.");
    }
}