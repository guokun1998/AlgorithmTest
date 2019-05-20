package nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.List;

public class test12_1 {
    public void reOrderArray(int [] array) {
        List<Integer> arrayList1 = new ArrayList<>(array.length);
        List<Integer> arrayList2 = new ArrayList<>(array.length);
        for (int t: array) {
            if (t % 2 == 0){
                arrayList2.add(t);
            } else {
                arrayList1.add(t);
            }
        }
        arrayList1.addAll(arrayList2);
        for (int i = 0; i < arrayList1.size(); i++) {
            array[i] = arrayList1.get(i);
        }
    }
}
