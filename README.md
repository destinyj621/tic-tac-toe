**Tic Tac Toe**
This Java program implements a simple command-line version of the classic game Tic Tac Toe. Players take turns marking cells in a 3x3 grid, aiming to be the first to form a horizontal, vertical, or diagonal line of their respective symbols.

**How to Play**
Setup: The game starts with an empty 3x3 grid.
Players: Two players take turns marking empty cells with their symbols. Player 1 uses "X" and Player 2 uses "O".
Gameplay: Players input the number of the cell they want to mark. The cell numbers correspond to the grid as follows:

1 | 2 | 3
---------
4 | 5 | 6
---------
7 | 8 | 9

Winning: The game ends when one player successfully forms a line of their symbols horizontally, vertically, or diagonally, or when the grid is completely filled without a winner (a tie).
Restart: To play again, simply rerun the program.

**How to Use**
Clone this repository to your local machine.
Compile the program using a Java compiler.
Run the compiled program.
Follow the on-screen instructions to play the game.

**Code Overview**
main(String[] args): The main method initializes the game, handles player turns, and checks for game over conditions.
printBoard(String[] nums): Prints the current state of the game board.
isValidMove(String[] nums, int move): Checks if a player's move is valid.
isGameOver(String[] nums): Checks if the game is over by examining the state of the board.
