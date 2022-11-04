import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chess {

    Board board;
    boolean playerTurnIsWhite;

    public Chess() {
        board = new Board();
        board.setupBoard();

        playerTurnIsWhite = true;
    }

    public void play() throws IOException {
        Move mover = new Move(board, playerTurnIsWhite);

        while (!gameIsOver()) {
            board.printBoard();

            // TODO: Homework - Is this really the chess game's responsibility to do the move conversion?
            //                       Refactor this code to make it the responsibility of a different class.
            // We'll be doing a simpler notation for our chess game. Notation will be a 5 or 6 character length. Form
            //       will take the shape of {a-h}{1-8}(\-x}{a-h}{1-8}{rnbqRNBQ}.
            //       First character is the from file
            //       Second character is the from rank
            //       Third character is - for move, x for capture
            //       Forth character is the to file
            //       Fifth character is the to rank
            //       Sixth character is the promotion of a pawn to a piece type. This is optional


            mover.processMove();

        }
        System.out.println("Game over.");
        System.out.println("Thanks for playing!");

    }
    private boolean gameIsOver() {
        return isPositionCheckmate() || isPositionStalemate();
    }

    private boolean isPositionStalemate() {
        return false;
    }

    private boolean isPositionCheckmate() {
        return false;
    }
}
