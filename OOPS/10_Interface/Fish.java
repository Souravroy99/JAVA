public class Fish implements Prey, Predator
{
    public void flee() {
        System.out.println("The fish is swimming away!\n");
    }

    public void hunt() {
        System.out.println("The fish is hunting!\n");
    }
} 