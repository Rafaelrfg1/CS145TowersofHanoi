//Name: Rafael Figueora
//Partners: Ben and Kennedi 
//Date: 2/14/25
//Assignment: Recursion Towers of Hanoi




public class TowersOfHanoi {


    // Recursive function to solve Towers of Hanoi
    static void solvingHanoi(int n, char firstTower, char destination, char secondTower) {
        // Base case: If only 1 disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + firstTower + " to " + destination);
            return;
        }

        // Move (n-1) disks from firstTower to secondTower
        solvingHanoi(n - 1, firstTower, secondTower, destination);

        // Move the nth (largest) disk from first tower to destination tower
        System.out.println("Move disk " + n + " from " + firstTower + " to " + destination);

        // Move (n-1) disks from second tower to destination tower
        solvingHanoi(n - 1, secondTower, destination, firstTower);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;  // Change this to simulate different disk counts
        System.out.println("Solving Towers of Hanoi for " + numberOfDisks + " disks:\n");
        solvingHanoi(numberOfDisks, 'A', 'C', 'B');  // Pegs: A (First tower), C (destination), B (Second Tower)
    }
}