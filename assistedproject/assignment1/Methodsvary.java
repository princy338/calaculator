package mainpro;
//method basic

public class Methodsvary {
	public int employee(){
		int id=206;
		return id;
		
	}
	//method overloading
	public float triangle(int b,int h) {
		float area=(float)0.5*b*h;
		System.out.println(area);
		return area;
	}
	
	public static void main(String[] args) {
		Methodsvary obj=new Methodsvary();
		int res=obj.employee();
		float ser=obj.triangle(10, 3);
		System.out.println("my id is: "+res);
		System.out.println("area of the circle is: "+ser);
		
		
		
	}
	//method overloading
	
}
