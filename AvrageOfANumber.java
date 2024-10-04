public class AvrageOfANumber {
    public static void main(String[] args) {
        int [] arr = {4,6,3,6,4,4,2};

        float sum = 0;
        for(int i : arr){
            sum+=i;
        }

        float avg = sum/arr.length;

//        System.out.println("Avrage is :"+avg);

        System.out.println(sum);
//        System.out.println("I am \"Yash\" ");


    }
}
