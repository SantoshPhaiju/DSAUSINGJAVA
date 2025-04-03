class TowerOfHanoi {

    static int steps = 1;
    // Recursive function to solve Tower of Hanoi
    static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            steps++;
            return;
        }

        // Move n-1 disks from source to auxiliary using destination as buffer
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        steps++;

        // Move n-1 disks from auxiliary to destination using source as buffer
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'B', 'C'); // A = Source, B = Auxiliary, C = Destination
        System.out.println("Steps taken " + steps);
    }
}
