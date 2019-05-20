package nowcoder.zhaoshangyinhangxinyongka.Test1;

import java.util.Arrays;
import java.util.Scanner;

public class Test3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String ps = scanner.nextLine();
            int limit = scanner.nextInt();
            int num = 0;
            String[] peoples = ps.split(" ");
            int[] people = new int[peoples.length];
            boolean[] isInBoat = new boolean[peoples.length];
            for (int i = 0; i < peoples.length; i++) {
                people[i] = Integer.valueOf(peoples[i]);
            }
            Arrays.sort(people);
            for (int i = people.length-1; i >= 0 ; i--) {
                int sum = 0;
                if (!isInBoat[i]){
                    isInBoat[i] = true;
                    num++;
                    sum+=people[i];
                    for (int j = i-1; j >= 0 ; j--) {
                        if (sum + people[j] <= limit){
                            isInBoat[j] = true;
                            sum+=people[j];
                        }
                        else {
                            break;
                        }
                    }
                }
                else {
                    continue;
                }
            }
            System.out.println(num);
        }
    }
}
