package oop.eclipse.ide.first;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		float sum=0;
		for(int x=0;x<args.length;x++){
		a=Integer.parseInt(args[0]);
		}
		for(float i=1;i<=a;i++){
			sum+=1/i;
		}
		System.out.println(sum);
		sum=0;
		for(float i=a;i>0;i--){
			sum+=1/i;
		}
		System.out.println(sum);
	}

}
