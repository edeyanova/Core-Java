package com.hackbulgaria.corejava;
import java.util.Scanner;

public class TTTGame {
   
   public static final int ROWS = 3, COLUMNS = 3;
   public static int[][] board = new int[ROWS][COLUMNS];
	
   public static final int EMPTY = 0;
   public static final int X = 1;
   public static final int O = 2;
 
   public static final int PLAYING = 0;
   public static final int X_WINS = 1;
   public static final int O_WINS = 2;
   public static final int DRAW = 3;
                                                      
   public static int GameState;  
   public static int currentPlayer; 
   public static int currentRow, currentColumn; 
 
   public static Scanner in = new Scanner(System.in); 
 
  
   public static void startGame() {
      for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMNS; ++j) {
            board[i][j] = EMPTY;  
         }
      }
     GameState = PLAYING; 
     currentPlayer = X;  
   }
 
 
   public static void playerMove(int player) {
      boolean validInput = false;  
      do {
         if (player == X) {
            System.out.print("Player 'X', enter your move between (row[1-3] column[1-3]): ");
         } else {
            System.out.print("Player 'O', enter your move between (row[1-3] column[1-3]): ");
         }
         int i = in.nextInt() - 1;  
         int j = in.nextInt() - 1;
         if (i >= 0 && i < ROWS && j >= 0 && j < COLUMNS && board[i][j] == EMPTY) {
            currentRow = i;
            currentColumn = j;
            board[currentRow][currentColumn] = player; 
            validInput = true;  
         } else {
            System.out.println("This move at isn't valid. ");
         }
      } while (!validInput); 
   }
 

   public static void restart(int player, int currentRow, int currentColumn) {
      if (hasWon(player, currentRow, currentColumn)) {  
    	  if ( GameState == PLAYING && player == X) {
    		 GameState = X_WINS;
    	  }
    	  else if ( GameState == PLAYING && player == O ) {
    		  GameState = O_WINS;
    	  }
      } else if (isDraw()) { 
         GameState = DRAW;
      }
      
   }
 
  
   public static boolean isDraw() {
      for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMNS; ++j) {
            if (board[i][j] == EMPTY) {
               return false;  
            }
         }
      }
      return true;  
   }
 
   
   public static boolean hasWon(int player, int currentRow, int currentColumn) {
      return (board[currentRow][0] == player         
                   && board[currentRow][1] == player
                   && board[currentRow][2] == player
              || board[0][currentColumn] == player     
                   && board[1][currentColumn] == player
                   && board[2][currentColumn] == player
              || currentRow == currentColumn            
                   && board[0][0] == player
                   && board[1][1] == player
                   && board[2][2] == player
              || currentRow + currentColumn == 2  
                   && board[0][2] == player
                   && board[1][1] == player
                   && board[2][0] == player);
   }
   
   public static void getCell(int something) {
	     switch (something) {
	         case EMPTY:  System.out.print("   "); break;
	         case O: System.out.print(" O "); break;
	         case X:  System.out.print(" X "); break;
	   }
	 }
   

   
   public static void getBoard() {
      for (int i = 0; i < ROWS; ++i) {
         for (int j = 0; j < COLUMNS; ++j) {
            getCell(board[i][j]); 
            if (j != COLUMNS - 1) {
               System.out.print("|");   
            }
         }
         System.out.println();
         if (i != ROWS - 1) {
            System.out.println(" ");
         }
      }
      System.out.println();
   }
 
   public static void main(String[] args) {
	     
	      startGame();
	   
	      do {
	         playerMove(currentPlayer);
	         restart(currentPlayer, currentRow, currentColumn); 
	         getBoard();
	         
	         if (GameState == X_WINS) {
	            System.out.println("'X' wins!");
	         } else if (GameState == O_WINS) {
	            System.out.println("'O' wins!");
	         } else if (GameState == DRAW) {
	            System.out.println("It's a Draw!");
	         }
	        
	         currentPlayer = (currentPlayer == X) ? O : X;
	      } while (GameState == PLAYING);
	   }
	 
   
}