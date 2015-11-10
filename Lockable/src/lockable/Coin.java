/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lockable;

/**
 *
 * @author spenc_000
 */
import java.util.Scanner;
public class Coin implements Lockable {
    private final int HEADS = 0;
    private final int TAILS = 1;
    private boolean isLocked;
    private int face;
    private int key = 123;
    Scanner scan = new Scanner(System.in);

    public void setKey(int newkey){
        newkey=scan.nextInt();
        key = newkey;
    };
    public void lock(int guesskey){
        System.out.println("What is the key?");
        guesskey = scan.nextInt();
        if(guesskey == key){
            isLocked = true;
        }
    }
    public void unlock(int guesskey){
        System.out.println("What is the key?");
        guesskey = scan.nextInt();
        if(guesskey==key){
            isLocked = false;
        }
        else {
            System.out.println("Wrong Key; Try again");
            guesskey=scan.nextInt();
        }
    }
    public boolean locked(){
        if(isLocked)
            return true;
        else return false;
    };
    public Coin (){
        flip();
    }
    //----------------------
    //Flips the coin by randomly choosing a face value
    //------------------------
    public void flip(){
        face = (int)(Math.random() * 2);
    }
    //Returns true if the current face of the coin is heads
    public boolean isHeads(){
        return(face == HEADS);
    }
    //-----------------------------------
    //Returns the current face of the coin as a string
    //--------------------------------------
    public String toString(){
        String faceName;
        if(face==HEADS){
            faceName = "Heads";
        }
        else{
            faceName = "Tails";
        }
        return faceName;
    
    }
}
