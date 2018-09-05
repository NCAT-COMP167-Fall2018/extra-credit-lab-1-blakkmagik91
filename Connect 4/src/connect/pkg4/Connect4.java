/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect.pkg4;

/**
 *
 * @author krystophermcrae
 */
public class Connect4 {
       private static char[][] gameBoard=new char[6][7];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameBoard= createBoard('k');
        printBoard(gameBoard);
        
    }
    public static char[][] createBoard(char input){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                gameBoard[i][j]=input;
            }
        }
        return gameBoard;
    }
    public static void printBoard(char[][]gameBoard){
    for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                System.out.print(gameBoard[i][j]+"  ");
            }
            System.out.println("");
        }
}
}
