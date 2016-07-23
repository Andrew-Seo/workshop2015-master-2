package Level_3;

public class Minion
{
	private String name;
	private int eyes;
	private String color;
	private String master;
	Minion(String n, int e, String c, String m){
		this.name = n;
		this.eyes = e;
		this.color = c;
		this.master = m;
		
	}
	String getName(){
		return(name);
	}
	int getEyes(){
		return(eyes);
	}
	String getColor(){
		return(color);
	}
	String getMaster(){
		return(master);
	}
	void setMaster(String m){
		this.master = m;
	}
}
