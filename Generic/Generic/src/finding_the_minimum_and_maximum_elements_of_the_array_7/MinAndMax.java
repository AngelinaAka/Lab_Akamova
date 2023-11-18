package finding_the_minimum_and_maximum_elements_of_the_array_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class MinAndMax<Y> {
    private ArrayList<Y> arrayList = new ArrayList<>();

    MinAndMax(ArrayList<Y> arrayList){
        this.arrayList = arrayList;
    }
    public Integer getMin(){
        return Collections.min((Collection<? extends Integer>) arrayList);
    }
    public Integer getMax(){
        return Collections.max((Collection<? extends Integer>) arrayList);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(-7);

        MinAndMax<Integer> array = new MinAndMax<>(arrayList);
        System.out.println(array.getMin());
        System.out.println(array.getMax());

    }
}
