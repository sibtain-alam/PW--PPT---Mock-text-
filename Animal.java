class Main{
    public static void main(String args[]){
        Animal ani = new Animal();
        Dog dg = new Dog();
        Cat ct = new Cat();
        Cow cw = new Cow();
        ani.makeSound();
    }
}
 class Animal{
    public void makeSound(){
        System.out.print("Animals make a sound");
    }
}
class Dog extends Animal{
     public void makeSound(){
        System.out.print("The Dog barks");
    }
}
class Cat extends Animal{
     public void makeSound(){
        System.out.print("The Cat meow");
    }
}
class Cow extends Animal{
     public void makeSound(){
        System.out.print("The Cow moos");
    }
}
