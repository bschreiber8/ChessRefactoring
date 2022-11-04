public class Board {
    private Piece[][] board;

    public Board(){
        board = new Piece[8][8];
    }

    public void setupBoard(){
        setupBlackPieces();

        board[6][0] = Piece.P;
        board[6][1] = Piece.P;
        board[6][2] = Piece.P;
        board[6][3] = Piece.P;
        board[6][4] = Piece.P;
        board[6][5] = Piece.P;
        board[6][6] = Piece.P;
        board[6][7] = Piece.P;
        board[7][0] = Piece.R;
        board[7][1] = Piece.N;
        board[7][2] = Piece.B;
        board[7][3] = Piece.Q;
        board[7][4] = Piece.K;
        board[7][5] = Piece.B;
        board[7][6] = Piece.N;
        board[7][7] = Piece.R;
    }

    private void setupBlackPieces() {
        board[0][0] = Piece.r;
        board[0][1] = Piece.n;
        board[0][2] = Piece.b;
        board[0][3] = Piece.q;
        board[0][4] = Piece.k;
        board[0][5] = Piece.b;
        board[0][6] = Piece.n;
        board[0][7] = Piece.r;
        board[1][0] = Piece.p;
        board[1][1] = Piece.p;
        board[1][2] = Piece.p;
        board[1][3] = Piece.p;
        board[1][4] = Piece.p;
        board[1][5] = Piece.p;
        board[1][6] = Piece.p;
        board[1][7] = Piece.p;
    }

    public Piece[][] getBoard(){
        return board;
    }

    public void printBoard() {
        StringBuilder sb = new StringBuilder();
        int rankNum = 8;
        for (Piece[] rank : board) {
            sb.append(rankNum + " ");
            for (Piece piece : rank) {
                if (piece != null) {
                    sb.append(piece);
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
            rankNum--;
        }
        sb.append("  abcdefgh");
        System.out.println(sb);
    }

    public void updateBoard(Piece fromPiece, int fromRankIndex, int fromFileIndex, int toRankIndex, int toFileIndex){
        board[toRankIndex][toFileIndex] = fromPiece;
        board[fromRankIndex][fromFileIndex] = null;
    }
}
