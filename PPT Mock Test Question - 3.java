//3. Write a Java program to calculate the 
//average of a list of numbers using a do-while loop.
class Main{
    public static void main(String args []){
        int n = 5; int sum = 0, avg = 0;
        for(int i = 1;i<=n;i++){
            sum+=i;
            avg = sum/n;
        }
        System.out.print(avg);
    }
}