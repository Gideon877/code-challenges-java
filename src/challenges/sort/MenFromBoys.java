package challenges.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MenFromBoys {

    public int[] get(final int[] values) {
        Arrays.sort(values);
        List even = new ArrayList();
        List odd = new ArrayList();
        for (int i = values.length -1 ; i >= 0; i--) {
            int current = values[i];
            if(current % 2 == 0) {
                if(!even.contains(current)) {
                    even.add(current);
                }
            } else {
                if(!odd.contains(current)) {
                    odd.add(current);
                }
            }
        }
        Collections.sort(even);
        even.addAll(odd);
        return even.stream().mapToInt(i-> (int) i).toArray();
    }
}
