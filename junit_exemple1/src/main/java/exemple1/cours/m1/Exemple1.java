package exemple1.cours.m1;

public class Exemple1 {
	
	 public int f1(int a , int b){
	        int r=0;
	        switch(a+b) {
	        case 5 : if (a < b)
	                 r=a+b; else {a=a-b ; r= a;} break;
	        case 10 : if (a < b) r=a-b; else {b=b-a; r=b;} break;
	        default : r=a+2*b; break;
	        }
	        return r;
	   }

}
