package caluculation;

public class caluculation_lib {
	
	private int m,n;
	
    public caluculation_lib(int m, int n) {
		
		this.m = m;
		this.n = n;
	}
	
  public int getPlus(){
	  return m+n;
	 }
 
  public double getMinus(){
	  return m-n;
	 }
  public double getProduct(){
	  return m*n;	
	 }
  public double getDivide(){
	  return m/n;
	 }
  public double getMod(){
	  return m%n;
	 }
  }