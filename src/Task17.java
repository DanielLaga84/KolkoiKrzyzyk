package isa.jjdd;


    public class Task17 {
        String[][] board;

        public Task17(int size) {
            board = new String[size][size];
            cleanBoard();
        }

        private void cleanBoard() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    board[i][j] = " ";
                }
            }
        }

        public void run() {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                    if (j < board.length - 1) {
                        System.out.print("|");

                    }
                }
                System.out.println(board[i][board.length - 1]);
                if (i < board.length - 1) {
                    for (int j = 0; j < board.length; j++) {
                        if (j < board.length - 1) {
                            System.out.print("--");
                        } else {
                            System.out.println("-");
                        }
                    }
                }
                System.out.println("");
            }
        }}

