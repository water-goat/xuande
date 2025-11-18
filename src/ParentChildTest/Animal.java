package ParentChildTest;

public  class Animal {
    public  void eat(){
        System.out.println("animal eating");
    }
    public void eatting(Animal animal){
        animal.eat();
    }
}
