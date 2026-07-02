
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gcl
 */
public class Main3 {
    interface sender{
        void send (String m);
    }
    static class emailsender implements sender{
        public void send(String m){
            System.out.println(" email"+ m);
        }
    }
    static class notification{
        sender s;
        notification (sender s){
            this.s=s;
        }
        void alert(String m){
            s.send(m);
        }
    }
    public static void main(String[] args) {
        sender e=new emailsender();
        notification n=new notification(e);
        n.alert("welcome");
    }
}
