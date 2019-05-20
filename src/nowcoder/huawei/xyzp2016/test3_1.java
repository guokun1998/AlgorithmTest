package nowcoder.huawei.xyzp2016;

import java.util.Scanner;

public class test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String in = scanner.nextLine();
//            if (in.equals("exit")){
//                break;
//            }
            int index = in.indexOf("-");
            String first = in.substring(0,index);
            String second = in.substring(index+1);
            brandType brandType1 = new brandType(first);
            brandType brandType2 = new brandType(second);
            int[][] compare = {{0,0,0,0,0,0,0},{0,1,0,0,2,0,2},{0,0,1,0,2,0,2},{0,0,0,1,2,0,2},{0,3,3,3,1,3,2},{0,0,0,0,2,1,2},{0,3,3,3,3,3,1}};//1:再去比数,0 不可比，2 小,3 大
            int result = compare[brandType1.type][brandType2.type];
            if (result == 0){
                System.out.println("ERROR");
            }
            else if (result == 2){
                System.out.println(second);
            }
            else if (result == 3){
                System.out.println(first);
            }
            else {
                if (brandType1.num<brandType2.num){
                    System.out.println(second);
                }
                else {
                    System.out.println(first);
                }
            }
        }
    }

}
class brandType{
    int num;
    int type;//1:单 2：对 3：三 4：普通炸 5：顺子 6：王炸
    public brandType(String s){
        int numOfBlank = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(" ")){
                numOfBlank++;
            }
        }
        if (numOfBlank == 0){
            if (s.length() == 2){
                this.num = 10;
            }
            else {
                this.num = new brand(s).num;
            }
            this.type = 1;
        }
        else if (numOfBlank == 1){
            if (s.length() <= 5){
                this.num = new brand(s.substring(0,1)).num;
                this.type = 2;
            }
            else {
                this.num = -1;
                this.type = 6;
            }
        }
        else if (numOfBlank == 2){

            this.num = new brand(s.substring(0,1)).num;
            this.type = 3;
        }
        else if (numOfBlank == 3){

            this.num = new brand(s.substring(0,1)).num;
            this.type = 4;
        }
        else if (numOfBlank == 4){
            this.num = new brand(s.substring(0,1)).num;
            this.type = 5;
        }
    }
}
class brand{
    int num;
    public brand(String s){
        if (s.equals("3")){
           this.num = 3;
        }
        else if (s.equals("4")){
            this.num = 4;
        }
        else if (s.equals("5")){
            this.num = 5;
        }
        else if (s.equals("6")){
            this.num = 6;
        }
        else if (s.equals("7")){
            this.num = 7;
        }
        else if (s.equals("8")){
            this.num = 8;
        }
        else if (s.equals("9")){
            this.num = 9;
        }
        else if (s.equals("1")){
            this.num = 10;
        }
        else if (s.equals("J")){
            this.num = 11;
        }
        else if (s.equals("Q")){
            this.num = 12;
        }
        else if (s.equals("K")){
            this.num = 13;
        }
        else if (s.equals("A")){
            this.num = 14;
        }
        else if (s.equals("2")){
            this.num = 15;
        }
        else if (s.equals("joker")){
            this.num = 16;
        }
        else if (s.equals("JOKER")){
            this.num = 17;
        }
    }
}
