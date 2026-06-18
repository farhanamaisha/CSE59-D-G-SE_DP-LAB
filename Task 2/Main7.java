
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Gcl
 */
interface clickable{
    void onclick();
}
class button implements clickable{
    public void onclick(){
        System.out.println("button was clicked");
    }
}
public class Main7 {
    public static void main(String[] args) {
        button button =new button();
        button .onclick();
    }
}
