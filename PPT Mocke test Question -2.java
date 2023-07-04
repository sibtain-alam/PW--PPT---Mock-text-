//2. Write a Java program to print the 
//Fibonacci series up to a given number using a for loop.
class Main{
    public static void main(String args []){
        int n = 7;
        int a[] = new int [n];
        if(n==0){
            a[0] = 0;
        }
        a[1] = 1;

        for(int i = 2;i<n;i++){
            a[i] = a[i-1]+a[i-2];
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}