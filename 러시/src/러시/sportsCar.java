package 러시;

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
		System.out.println("색깔은 =" + color);
		System.out.println("기어는 =" + gear);
		System.out.println("최고속도는 =" + speedUp);
		System.out.println("최저속도는 =" + speedDown);
}



class SUVCar extends car
{
	
	
	public void print()
	{
		System.out.println("색깔은 =" + color);
		System.out.println("기어는 =" + gear);
		System.out.println("최고속도는 =" + speedUp);
		System.out.println("최저속도는 =" + speedDown);
		
	}
	
	
	      
}
}
