import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sortniz {
  		
	public enum Poredak{ RASTUCI,OPADAJUCI };
	public static void sortirajniz(double[]niz,Poredak p) {
	            
		for(int a=0;a<niz.length-1;a++) {
		 for(int i=0;i<niz.length-1;i++){
		   
		   if( p==Poredak.RASTUCI) {
			 
		  if( niz[i]<niz[i+1] ) {
			 double privremeno= niz[i];
		       niz[i]=niz[i+1];
		       niz[i+1]= privremeno;    
		   }
		   }  else( p==Poredak.OPADAJUCI){
	      if( niz[i]>niz[i+1] ) {
	    	 double privremeno= niz[i];
		       niz[i]=niz[i+1];
		      niz[i+1]= privremeno;  
	      }
		  }
	      }
		  }
		  }
	     
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // Scanner s=new Scanner(System.in);                         izgleda da ne treba 
	 double[]niz={11,42,55,4,8,99,6,3,77,92};
	 
	 
	 System.out.println(" Niz je bio  : " + Arrays.toString(niz));
	 
	 Sortniz.sortirajniz(niz,Poredak.OPADAJUCI);
	 
	 
	 System.out.println(" Niz je sada  : " + Arrays.toString(niz));
	
	} 
} 

	
