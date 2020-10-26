import java.util.Scanner;

public class chess{
	public static int k1,k2,k3,k4;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                for(int i=0;i<m;i++){
                int n = sc.nextInt();
                n =(int) Math.pow(2, n);
                int x,y;
                x = sc.nextInt();
                y = sc.nextInt();
                k1=k2=k3=k4=0;
                calc(1,n,1,n,x,y);
                System.out.println(k1+" "+k2+" "+k3+" "+k4);
        }
}
public static void calc(int rs,int re,int cs,int ce,int x,int y){
                if(rs==re)
                        return;
                int rm = (rs+re)/2;
                int cm = (cs+ce)/2;
                if(x<=rm){
                        if(y<=cm){
                                k1++;
                                calc(rs,rm,cs,cm,x,y);
                                calc(rs,rm,cm+1,ce,rm,cm+1);
                                calc(rm+1,re,cs,cm,rm+1,cm);
                                calc(rm+1,re,cm+1,ce,rm+1,cm+1);
                        }else{
                                k2++;
                                calc(rs,rm,cs,cm,rm,cm);
                                calc(rs,rm,cm+1,ce,x,y);
                                calc(rm+1,re,cs,cm,rm+1,cm);
                                calc(rm+1,re,cm+1,ce,rm+1,cm+1);
                        }
                }else{
                        if(y<=cm){
                                k3++;
                                calc(rs,rm,cs,cm,rm,cm);
                                calc(rs,rm,cm+1,ce,rm,cm+1);
                                calc(rm+1,re,cs,cm,x,y);
                                calc(rm+1,re,cm+1,ce,rm+1,cm+1);
                        }else{
                                k4++;
 				 calc(rs,rm,cs,cm,x,y);
                                calc(rs,rm,cm+1,ce,rm,cm+1);
                                calc(rm+1,re,cs,cm,rm+1,cm);
                                calc(rm+1,re,cm+1,ce,x,y);
                        }
                }
        }
}

