public class Lecture4Problem5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 787, 1000};
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < array.length -1; i++){
            int currentMax = max(array[i], array[i+1]);
            if(currentMax > max){
                max = currentMax;
            }
        }
        System.out.println(max);
    }
    public static int max(int a, int b){
        if(a > b){
            return a;
        }return b;
    }
}
