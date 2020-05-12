package CreationalDesignPattern;

abstract class Vehicle
{
	public abstract int getwheel();
	
	public String toString()
	{
		return "wheel: "+this.getwheel();
	}
	
}
class car extends Vehicle
{
	int wheel;
	car(int wheel)
	{
		this.wheel=wheel;
	}
	@Override
	public int getwheel()
	{
		return this.wheel;
	}
}
class bike extends Vehicle
{
	int wheel;
	bike(int wheel)
	{
		this.wheel=wheel;
	}
	@Override
	public int getwheel()
	{
		return this.wheel;
	}
}
class auto extends Vehicle
{
	int wheel;
	auto(int wheel)
	{
		this.wheel=wheel;
	}
	@Override
	public int getwheel()
	{
		return this.wheel;
	}
}
class VehicleFactory
{
	public static Vehicle getIntance(String type,int wheel)
	{
		if(type =="car")
		{
			return new car(wheel);
		}
		else if(type=="bike")
		{
			return new bike(wheel);
		}
		else if(type=="auto")
		{
			return new auto(wheel);
		}
		return null;
	}
}

public class FactoryEx 
{
	public static void main(String args[])
	{
		Vehicle car=VehicleFactory.getIntance("car", 4);
		System.out.println(car);
		Vehicle bike=VehicleFactory.getIntance("bike", 2);
		System.out.println(bike);
		Vehicle auto =VehicleFactory.getIntance("auto", 3);
		System.out.println(auto);
	}
}
