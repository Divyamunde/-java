public class sum_of_1_to_100{
    public static void main(String[]args) {
        int sum = 0
        for(int i=1;i<=100;i++){
            if(i==50){
                continue;
            }
            sum=sum+i;
        }
        System.out.print(sum);
    }
}







