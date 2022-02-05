package mainpro;

public class Acessmodifiers {
	public void employee() {
		System.out.println("im an software employee- ");
	}
	void designation() {
		System.out.println("role-ASE");
	}
	private void salary() {
		float sal=3.5f;
		System.out.println("salary- "+sal);
	}
	protected void bond() {
		int years=2;
		System.out.println("bond: "+years);
	}
	public static void main(String[] args) {
		int num=206;
		Acessmodifiers job=new Acessmodifiers();
		job.employee();
		job.designation();
		job.salary();
		job.bond();
	}
	}

