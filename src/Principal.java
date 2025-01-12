import com.mateusdalcantara.resources.TicTacToe;

/** Method to run a simple game Tic-Tac-Toe. */
public class Principal {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        /** X moves */               /** O moves */
        game.putMark(1, 1);     game.putMark(0, 2);
        game.putMark(2, 2);     game.putMark(0, 0);
        game.putMark(0, 1);     game.putMark(2, 1);
        game.putMark(1, 2);     game.putMark(1, 0);
        game.putMark(2, 0);

        System.out.println(game);
        int winningPlayer = game.winner();
        String[] outcome = {"O wins", "Tie", "X wins"}; //rely on ordering
        System.out.println(outcome[1 + winningPlayer]);

        /*
            Output on terminal:

                O|X|O
                -----
                O|X|X
                -----
                X|O|X
                Tie

         */

    }
}
