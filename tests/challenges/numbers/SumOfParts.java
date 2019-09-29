package challenges.numbers;

public class SumOfParts {

    public int[] getSum(int[] numbers) {
        int[] sum = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
              for (int k = i; k < numbers.length; k++) {
                  sum[i] = sum[i] + numbers[k];
              }
        }
        return sum;
    }
    public int[] createNumbers() {
        int[] num = new int[200000];
    for (int i = 0; i < 200000; ++i) {
      num[i] = i * 13;
    }

    return  num;
    }
}
