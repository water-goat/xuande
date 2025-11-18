package ParentChildTest;

public class DemoTest {
    public static void main(String[] args) {

        Dog dog=new Dog();
        Cat cat=new Cat();
        Animal animal=new Animal();
        Animal animal1=new Dog();
        Animal animal2=new Cat();
        animal.eatting(cat);
        int arr[]={1,2,3};
        int[]arr1={4,5,6};
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
