import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        String[] nums = new String[9];
        int count = 0; // Initialize count to 0

        Scanner input = new Scanner(System.in);

        while (!isGameOver(nums)) { // Check if the game is over
            printBoard(nums); // Print the current state of the board

            // Determine which player's turn it is
            String player = (count % 2 == 0) ? "Player 1" : "Player 2";
            System.out.print(player + " go: ");
            int move = input.nextInt() - 1;

            // Check if the chosen cell is already occupied
            while (!isValidMove(nums, move)) {
                System.out.println("Invalid move! Try again.");
                System.out.print(player + " go: ");
                move = input.nextInt() - 1;
            }

            // Set the player's move on the board
            nums[move] = (count % 2 == 0) ? "X" : "O";
            count++; // Increment count for the next player
        }

        input.close();
    }

    // Method to print the current state of the board
    public static void printBoard(String[] nums) {
        for (int i = 0; i < 9; i++) {
            System.out.print("| " + (nums[i] != null ? nums[i] : " ") + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println("|");
                if (i < 6)
                    System.out.println("-------------");
            }
        }
    }

    // Method to check if a move is valid
    public static boolean isValidMove(String[] nums, int move) {
        return (move >= 0 && move < 9 && nums[move] == null);
    }

    // Method to check if the game is over
    public static boolean isGameOver(String[] nums) {
        // Check rows
        for (int i = 0; i < 9; i += 3) {
            if (nums[i] != null && nums[i].equals(nums[i + 1]) && nums[i].equals(nums[i + 2]))
                return true;
        }
        // Check columns
        for (int i = 0; i < 3; i++) {
            if (nums[i] != null && nums[i].equals(nums[i + 3]) && nums[i].equals(nums[i + 6]))
                return true;
        }
        // Check diagonals
        if (nums[0] != null && nums[0].equals(nums[4]) && nums[0].equals(nums[8]))
            return true;
        if (nums[2] != null && nums[2].equals(nums[4]) && nums[2].equals(nums[6]))
            return true;
        // Check if board is full
        for (int i = 0; i < 9; i++) {
            if (nums[i] == null)
                return false;
        }
        return true;
    }
}
