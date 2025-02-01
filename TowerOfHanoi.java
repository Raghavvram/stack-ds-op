class TowerOfHanoi {
    // Recursive function to solve Tower of Hanoi puzzle
    static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: only one disk to move
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }
        
        // Move n-1 disks from source to auxiliary, using destination as temporary storage
        solveHanoi(n - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
        
        // Move the n-1 disks from auxiliary to destination, using source as temporary storage
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3; // Number of disks to move
        solveHanoi(numberOfDisks, 'A', 'B', 'C'); // Names of rods: A, B, and C
    }
}
