
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
class countdown{
    void start(){
        for(int i=5;i>=1;i--){
        System.out.println(i);}
        System.out.println("go");
    }
}
public class Main3 {
    public static void main(String[] args) {
        countdown countdown =new countdown();
        countdown.start();
    }
}
