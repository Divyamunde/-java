class Adittion{

    public int add(int a , int b ){
        return a+b;
    }

        public int add(int a , int b, int c){
         return a+b+c;

        }

}
class Methodoverloading{
    public static void main(String[]args){
        Addition a = new Addition();
        int result1 = a.add(10,2);
        int result2 = a.add(4,5,7);
        System.out.println("Addition of 2 numbers:"+result1);
        System.out.println("Addtion of 3 numbers:"+result2);
    }
}