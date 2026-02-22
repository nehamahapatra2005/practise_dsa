public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Move n-1 disks from source to auxiliary
        towerOfHanoi(n - 1, from, aux, to);

        // Move nth disk from source to destination
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Move n-1 disks from auxiliary to destination
        towerOfHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3; // number of disks

        towerOfHanoi(n, 'A', 'C', 'B');
    }
}