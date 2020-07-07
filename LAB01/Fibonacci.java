package oop.eclipse.ide.first;

public class Fibonacci {
	public static void main(String[] args) {
		int sum = 0;
		float avg=0;
		int array[];
		for(int i=0; i<args.length; i++){
		sum = Integer.parseInt(args[i]);
		}
		array = new int[sum];
		array[0]=1;
		array[1]=1;
		for(int x=2;x<sum;x++){
			array[x]=array[x-1]+array[x-2];
		}
		int z=0;
		for(int y=0;y<sum;y++){
			System.out.println(array[y]);
			
			z=z+array[y];
			if(y==19){
				avg=z/sum;
				System.out.println(avg);
			}
		}	
		
				
	}
}
