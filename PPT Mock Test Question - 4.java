//4. Write a Java program to find the largest of
// three numbers using nested if-else statements.
class Main{
    public static void main(String args[]){
        int a = 10, b= 9, c = 11;
        if(a>b && a>c){
            System.out.print(a);
        }else if(b>c){
            System.out.print(b);
        }else{
            System.out.print(c);
        }
    }
}