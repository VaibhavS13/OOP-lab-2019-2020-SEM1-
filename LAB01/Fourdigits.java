package oop.eclipse.ide.first;

public class Fourdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=0; i<args.length; i++){
			
			x = Integer.parseInt(args[i]);
		}
		int p=0;
      int arr[]=new int[4];
      arr[0]= x%10;
      arr[1]=((x%100)-x%10)/10;
      arr[2]=(x%1000-x%100)/100;
      arr[3]=x/1000;
      for(int z=0;z<4;z++){
    	  for(int y=0;y<4;y++){
    		  for(int a=0;a<4;a++){
    			if(arr[a] != arr[y] && arr[a]!=arr[z] && arr[y]!= arr[z]){
    				p++;
    			System.out.println(arr[a]+""+arr[y]+""+arr[z]);
    			}
    			
        	  }
    	  }
      }
      
    	System.out.println(p);	  
}
}