
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
class numberchecker{
    void check (int num){
        boolean result=(num%2==0)&&(num>10);
        System.out.println("result");
    }
}
public class Main2 {
    public static void main(String[] args) {
        numberchecker checker=new numberchecker();
        checker.check(14);}
}
