
import java.util.*;
public class Three {
	    public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	        System.out.println("请输入日期:");
	    String date=in.nextLine();
	    String[] split = date.split("-");
	        int year=Integer.parseInt(split[0]);
	        
	        int month=Integer.parseInt(split[1]);
	        
	        int day=Integer.parseInt(split[2]);
	 
	        int m=0;
	        int days=0;
	        int[][] a={{31,28,31,30,31,30,31,31,30,31,30,31},{31,29,31,30,31,30,31,31,30,31,30,31}};
	         
	     
	        if((year%4==0&&year%100!=0)||year%400==0){
	            m=1;   
	        }else{
	            m=0;
	        }
	         
	        for(int i=0;i<month-1;i++){
	            days+=a[m][i];
	        }
	        days+=day;
	        System.out.println("您输入的日期为当年的第"+day+"天");    
	        
	 
	    }
	}

