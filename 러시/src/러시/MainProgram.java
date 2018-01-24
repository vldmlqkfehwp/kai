package 러시;
import java.util.Scanner;
public class MainProgram {

	public static void main(String[] args) 
	{
		studentManeger manager =new studentManeger();
		
		for(int i=0; i<5; i++)
		{
			manager.addStudent();
		}
       
         manager.findAndPrint("최성은");
         manager.printAll();
}
}