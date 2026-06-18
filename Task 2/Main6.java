
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
class applet{
    void launch(){
        System.out.println("appled launch");
    }
    
}
class gameapplet extends applet{
    void play(){
        System.out.println("playing game");
    }
}

public class Main6 {
    public static void main(String[] args) {
        gameapplet game=new gameapplet();
        game.launch();
        game. play();
    }
}
