package daythirteen;

public class Day_thirteen extends Thread {
	
   private int n;
   private String msg;
   
   
   public Day_thirteen(int n, String msg) {
    this.n=n;
    this.msg=msg;
    
    
    
}
   


public void run() {
	   for(int i=1;i<=n;i++) {
		   System.out.println(msg+i);
	   }
   }
}
