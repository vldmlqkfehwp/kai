package ·¯½Ã;

public class car {

	 int speedUp;
	 int speedDown;
	 int speed;
	 int gear;
	 int setTurbo;

	
	public int getSpeedUp() {
		return speedUp;
	}

	public void setSpeedUp(int speedUp) {
		this.speedUp = speedUp;
	}

	public int getSpeedDown() {
		return speedDown;
	}

	public void setSpeedDown(int speedDown) {
		this.speedDown = speedDown;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSetTurbo() {
		return setTurbo;
	}

	public void setSetTurbo(int setTurbo) {
		this.setTurbo = setTurbo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGear() {
		return gear;
	}

	public String color;
	
	public void speedUp(int increment)   
	{
		speedUp += increment;
	}

    public void speedDown(int decrement)
    {
    	speedDown -= decrement;
    }
     
    public void setGear(int newGear)
    {
    	gear = newGear;
    }

    public void  setTurbo(int increment)   
	{
    	 setTurbo += increment;
	}
      
  
  
}

