package Level_3;

public class Person
{
	Boolean isSmelly;
	int Height;
	String superPower;
	public Boolean getIsSmelly()
	{
		return isSmelly;
	}
	public Person(Boolean isSmelly, int height, String superPower)
	{
		super();
		this.isSmelly = isSmelly;
		Height = height;
		this.superPower = superPower;
	}
	public void setIsSmelly(Boolean isSmelly)
	{
		this.isSmelly = isSmelly;
	}
	public int getHeight()
	{
		return Height;
	}
	public void setHeight(int height)
	{
		Height = height;
	}
	public String getSuperPower()
	{
		return superPower;
	}
	public void setSuperPower(String superPower)
	{
		this.superPower = superPower;
	}
	public String toString(){
		return "" + isSmelly;
	}
	public int isHeight(){
		return Height;
	}
	public String toString1(){
		return "" + superPower;
	}
}
