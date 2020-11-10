package jp.ac.uryukyu.ie.nakarx;

public class Chatbot {
    String name = "default";

    public Chatbot(){
        System.out.println("chatbotの原型を作成します。");
    }
    public Chatbot(String _name){
        this.name = _name;
        System.out.println("チャットボット名 "+this.name+" を作成します。");
    }
    public void greeting(){
        System.out.println("はじめまして "+this.name+" です。よろしくお願いします。");
    }
}