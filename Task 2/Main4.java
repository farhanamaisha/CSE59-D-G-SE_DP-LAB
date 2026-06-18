
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
class sensor{
String name;
int batterylevel;
sensor(String name,int batterylevel){
    this.name=name;
    this.batterylevel=batterylevel;
    
}
void c(){
    batterylevel=100;
    System.out.println("sensor fully vharged");
}
}
public class Main4 {
    public static void main(String[] args) {
        sensor s=new sensor("twmp sensor",45);
    s.c();
        System.out.println("battery level"+ s.batterylevel);
    }
}
