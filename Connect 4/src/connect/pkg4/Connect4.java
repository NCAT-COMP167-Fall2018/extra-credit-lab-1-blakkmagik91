/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect.pkg4;

import java.util.Random;

/**
 *
 * @author krystophermcrae
 */
public class Connect4 {
       public static char[][] gameBoard=new char[6][7];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        gameBoard= createBoard('b');
        printBoard();
        playGame(gameBoard);
        
    }
    public static char[][] createBoard(char input){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                gameBoard[i][j]=input;
            }
        }
        return gameBoard;
    }
    public static void printBoard(){
        for(int i=0;i<6;i++){
            for(int j=0;j<7;j++){
                System.out.print(gameBoard[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    public static void takeTurn(char currentPlayer){
        Random rand=new Random();
        int c =rand.nextInt(6);
        int r=5;
        boolean turnCheck=false;
        while(turnCheck==false){
        if (gameBoard[r][c]=='b'){
            gameBoard[r][c]=currentPlayer;
            turnCheck=true;
        }else{
            r--;
        }
        if(r==-1){
            c =rand.nextInt(6);
            r=5;
        }
    }
    }
    public static char playGame(char gameBoard[][]){
        boolean red=true;
        boolean yellow =false;
        int i =0;
        while(i<11){
            if(red){
                takeTurn('r');
                printBoard();
                System.out.println("");
                red=false;
                yellow=true;
            }else if(yellow){
                takeTurn('y');
                printBoard();
                System.out.println("");
                red=true;
                yellow=false;
            }
        i++;
                }
        
        return 't';
    }
}
