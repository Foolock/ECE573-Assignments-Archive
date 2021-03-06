import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        TwoThreeTree<Integer, Integer> ttt = getOrderedInput(500);
        ttt.inOrderPrint();
    }


    private static TwoThreeTree<Integer, Integer> getOrderedInput(int num){
        TwoThreeTree<Integer, Integer> r = new TwoThreeTree<>();
        for(int i=0;i<num;i++){
            r.put(i, i);
        }
        return r;
    }

    /*
        A function to get %num% random inputs
    */
    private static TwoThreeTree<Integer, Integer> getRandomInput(int num){
        TwoThreeTree<Integer, Integer> r = new TwoThreeTree<>();
        int[] inputs = new int[num];
        for(int i=0;i<num;i++){
            inputs[i] = i;
        }
        shuffle(inputs);
        for (int i=0;i<num;i++){
            r.put(inputs[i], i);
        }
        return r;
    }

    private static void shuffle(int[] ar){
        /*
            See
            https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array
         */
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }

}
