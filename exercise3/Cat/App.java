public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        MyPet myPet = new MyPet();
        myPet.Meow();
        System.out.println(myPet.eyeColor);
        System.out.println(myPet.fur);
    }
}