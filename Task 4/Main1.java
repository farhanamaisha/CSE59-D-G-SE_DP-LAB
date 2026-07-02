
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
public class Main1 {
    static class teammember{
        String n;
        teammember(String n){
        this.n=n;
        }
    }
    static class employee extends teammember{
        employee(String n){
            super(n);
        }
        void bonus(){
            System.out.println(n + "get bonus");
        }
    }
    static class contractor extends teammember{
        contractor(String n){
            super(n);
        }
        void work(){
            System.out.println(n + "is working");
        }
        
    }
    public static void main(String[] args) {
        employee e= new employee("john");
        contractor c= new contractor ("alex");
        e.bonus();
        c.work();
    }
}
