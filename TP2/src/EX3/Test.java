package EX3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Valeur myval=new Valeur();
		
		Ajob job1= new Ajob(myval, 1);
		Ajob job2 =new Ajob(myval, -1);
		
		new Thread(job1).start();
		new Thread(job2).start();
		
	}

}
