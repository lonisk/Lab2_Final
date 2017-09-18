package pkgShape;

public class Rectangle {

	private int iwidth;
	private int ilength;
	
	
	public Rectangle(int iwidth, int ilength) {
		super();
		this.iwidth = iwidth;
		this.ilength = ilength;
	}
	public int getIwidth() {
		return iwidth;
	}
	public void setIwidth(int iwidth) {
		this.iwidth = iwidth;
	}
	public int getIlength() {
		return ilength;
	}
	public void setIlength(int ilength) {
		this.ilength = ilength;
	}
	
	public double area()
	{
		return ilength * iwidth;	
	}

	
}
