
package chess_system;

import chess.ChessMatch;


public class Chess_System {


    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
    
}
