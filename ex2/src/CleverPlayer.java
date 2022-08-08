/**
 * CleverPlayer class that implements Player interface
 */
public class CleverPlayer implements Player
{
    /**
     * This method mediates a tictactoe game turn of the CleverPlayer. The method implements a strategy of scanning the
     * board row by row and placing the mark at the first available spot.
     * @param board a Board type object on which the relevant game is executed
     * @param mark the mark type to be placed on board by CleverPlayer
     */
    public void playTurn(Board board , Mark mark)
    {
        for (int row = 0 ; row < board.SIZE ; row ++)
        {
            for (int col = 0 ; col < board.SIZE ; col ++)
            {
                if (board.getMark(row , col) == Mark.BLANK)
                {
                    board.putMark(mark,row ,col);
                    return;
                }
            }
        }
    }
}
