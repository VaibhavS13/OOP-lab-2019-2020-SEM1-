package oop.eclipse.ide.first;

public class pairwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr=new int[7];
		for(int i=0; i<args.length; i++){
		arr[i]=Integer.parseInt(args[i]);
		}
		
		for(int i=0; i<args.length-1; i++){
		   for(int x=i+1;x<args.length-1;x++){
			   if(arr[i]+arr[x] == arr[args.length-1]){
				   System.out.println(arr[i]+" "+arr[x] );
				   
			   }
				   
		   }
		}
	}

}
