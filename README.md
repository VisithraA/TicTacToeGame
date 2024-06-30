##Tic-Tac-Toe Game
    -This is a console based Tic-Tac-Toe game in Java, using a Model-View-ViewModel (MVVM) architecture.

##Features
    Player vs Player: 
        -Two players can take turns to play the game.
    Winning Condition: 
        -The game checks for winning conditions after each move.
    Draw Condition: 
        -If no player wins after all cells are filled, the game declares a draw.
    Input Validation: 
        -Validates user inputs to ensure valid moves.
        
##Components
    View
      -The TicTacToeView handles user interaction through the console. It prompts players for moves and displays the current state of the game board.
    ViewModel
      -The TicTacToeViewModel manages the game logic, including checking for win conditions (isValid() method) and placing moves on the board (place() method).
    MainClass
      -The MainClass initializes the game by creating an instance of TicTacToeView and starting the game loop.

##Usage
    To play the game:
        1. Run the MainClass which initializes and starts the game.
        2. Follow the prompts to enter the coordinates for your move.
        3. The game will display the updated board after each move.
        4. If a player wins or the game ends in a draw, the result will be displayed.
