package ����;
import java.util.Scanner;
public class studentManeger {

	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray;   //�л������� ���� �� �ִ� �迭
	private int currentNumber;
	
	public studentManeger() {
		studentArray = new Student[ MAX_PEOPLE];
		currentNumber = 0;
	}
	
	public studentManeger(int size)
	{
	  studentArray = new Student[size];
	  currentNumber =0;
	}
	
	
	public void addStudent()
	{
          
    // �л���ü ���� �����ϱ�
      Student a = new Student();
	    	
		    
    // ȭ�鿡�� �Է� �޾Ƽ� �л��� ������ ����
      Scanner scan = new Scanner(System.in);
      System.out.print("�л����̸�");
      String name = scan.next();
      student.setName(name);
      
      int number = scan.nextInt();
	  a.setAge(number);	    
	  
    //�迭�� �л��� ����
	  studentArray[0]= a;
	  int[] studentArray = new int[20];
		    
		
    // ���� �������  ����++
	  for(int i=0; i<19; i++)
	  {
		  System.out.print(number);
	  }
	
	
	
	
	}
	public void findAndPrint(String name)
	{
		//�Է¹��� name�� ��ġ�ϴ� �л��� �ִ��� ã�Ƽ�
		// ���� ��ġ�ϴ� �л��� ������ �� �л��� ���� ���
        // ������ ��ġ�ϴ� ��� ���ٰ� ���
	}
    public void printAll()
    {
    	//���� ��ϵǾ� �ִ� �л����� �������
    	for(int i=0; i<currentNumber; i++)
    	{
    		System.out.println(i+"�� �л� ����");
    		studentArray[i].print();
    	}
    }

}
	
	

