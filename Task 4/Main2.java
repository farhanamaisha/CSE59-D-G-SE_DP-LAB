
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
public class Main2 {
    interface printer {
        void print();
        
    }
    interface scanner{
        void scan();
    }
    interface fax{
        void fax();
    }
    static class basicprinter implements printer {
        public void print(){
            System.out.println("printing");
        }
    }
    static class copier implements printer,scanner,fax{
        public void print(){
            System.out.println(" printing");
        }
        public void scan(){
            System.out.println("scanning");
        }
        public void fax(){
            System.out.println("faxing"); 
        }
            
    }
    public static void main(String[] args) {
        basicprinter b= new basicprinter();
        copier c=new copier();
        b.print();
        c.print();
        c.scan();
        c.fax();
    }
}
