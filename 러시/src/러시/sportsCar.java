package ����;

class sportsCar extends car{

	boolean turbo;
	
	public void setTurbo(boolean newValue)
	{
		turbo = newValue;
	}
	@Override
	public void speedUp(int increment)   
	{
		speedUp += increment*2;
	}
	@Override
	public void speedDown(int decrement) {
		speedDown -= decrement*2;
	}
	public void print()
	{
		System.out.println("������ =" + color);
		System.out.println("���� =" + gear);
		System.out.println("�ְ�ӵ��� =" + speedUp);
		System.out.println("�����ӵ��� =" + speedDown);
}



class SUVCar extends car
{
	
	
	public void print()
	{
		System.out.println("������ =" + color);
		System.out.println("���� =" + gear);
		System.out.println("�ְ�ӵ��� =" + speedUp);
		System.out.println("�����ӵ��� =" + speedDown);
		
	}
	
	
	      
}
}
