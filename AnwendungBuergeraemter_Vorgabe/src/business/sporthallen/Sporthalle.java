package business.sporthallen;

public class Sporthalle {
	private String name;
	private int quadratmeter;
	private String bodenbelag;
	
	public Sporthalle(String name, int quadratmeter, String bodenbelag) {
		this.name = name;
		this.quadratmeter = quadratmeter;
		this.bodenbelag = bodenbelag;
	}
	
	public String getBodenbelag() {
		return bodenbelag;
	}
	public String getName() {
		return name;
	}
	public int getQuadratmeter() {
		return quadratmeter;
	}
	public void setBodenbelag(String bodenbelag) {
		this.bodenbelag = bodenbelag;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuadratmeter(int quadratmeter) {
		this.quadratmeter = quadratmeter;
	}
	
	public String toString() {
		return "" + this.name + ";" + this.quadratmeter + ";" + this.getBodenbelag();
	}

}
