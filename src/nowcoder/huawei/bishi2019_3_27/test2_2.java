package nowcoder.huawei.bishi2019_3_27;

import java.util.Scanner;

public class test2_2 {

    static boolean current[]=new boolean[5];
    static int[] x=new int[6];
    static int[] y=new int[6];
    static int min=90000000;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()){
            for(int i=0;i<5;i++){
                x[i]=cin.nextInt();
                y[i]=cin.nextInt();
                current[i]=false;
            }
            x[5]=0;
            y[5]=0;
            search(0,5);
            System.out.print(min);
        }
    }

    static void search(double cu,int r){
        boolean p=false;
        for(int i=0;i<5;i++){
            if(!current[i]){
                p=true;
                double last = Math.sqrt((x[i]-x[r])*(x[i]-x[r])+(y[i]-y[r])*(y[i]-y[r]));
                current[i]=true;
                search(cu+last,i);
                current[i]=false;
            }
        }
        if(!p){
            int fin=(int)(cu+Math.sqrt(x[r]*x[r]+y[r]*y[r]));
            if(fin<min) min=fin;
        }
    }
}
/*
200 0 200 10 200 50 200 30 200 25
0 -8 0 -7 0 -2 0 3 0 7
 */