
public class CenomicRangeQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] solution(String S, int[] P, int[] Q) {
	        
	        int a = 1;
	        int c = 2;
	        int g = 3;
	        int t = 4;
	        int size = P.length;
	        int[] intArr = new int[size];
	        
	        for(int i=0; i<size; i++){
	            int sP = P[i];
	            int sQ = Q[i];
	            
	            String sS = S.substring(sP, sQ);
	            if(sS.indexOf("A") != -1){
	                   intArr[i] = a;
	                   continue;
	            }else if(sS.indexOf("C") != -1){
	                   intArr[i] = c;
	                   continue;
	            }else if(sS.indexOf("G") != -1){
	                   intArr[i] = g;
	                   continue;
	            }else if(sS.indexOf("T") != -1){
	            	   intArr[i] = t;
	            	   continue;
	            }
	        }
	        
	        return intArr;
	        
	    }
}
