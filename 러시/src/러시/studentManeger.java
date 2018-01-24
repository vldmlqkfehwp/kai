package 러시;
import java.util.Scanner;
public class studentManeger {

	public static final int MAX_PEOPLE = 20;
	private Student[] studentArray;   //학생변수를 담을 수 있는 배열
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
          
    // 학생객체 먼저 생성하기
      Student a = new Student();
	    	
		    
    // 화면에서 입력 받아서 학생의 정보를 저장
      Scanner scan = new Scanner(System.in);
      System.out.print("학생의이름");
      String name = scan.next();
      student.setName(name);
      
      int number = scan.nextInt();
	  a.setAge(number);	    
	  
    //배열에 학생을 대입
	  studentArray[0]= a;
	  int[] studentArray = new int[20];
		    
		
    // 현재 몇명인지  숫자++
	  for(int i=0; i<19; i++)
	  {
		  System.out.print(number);
	  }
	
	
	
	
	}
	public void findAndPrint(String name)
	{
		//입력받은 name과 일치하는 학생이 있는지 찾아서
		// 만약 일치하는 학생이 있으면 그 학생의 정보 출력
        // 없으면 일치하는 사람 없다고 출력
	}
    public void printAll()
    {
    	//현재 등록되어 있는 학생들의 정보출력
    	for(int i=0; i<currentNumber; i++)
    	{
    		System.out.println(i+"반 학생 정보");
    		studentArray[i].print();
    	}
    }

}
	
	

