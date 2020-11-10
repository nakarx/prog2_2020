package jp.ac.uryukyu.ie.nakarx;

public class Main {
    public static void main(String[] args) {
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("chatbot2");
        bot1.greeting();
        bot2.greeting();
    }
}
