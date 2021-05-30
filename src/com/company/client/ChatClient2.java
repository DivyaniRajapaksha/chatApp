package com.company.client;

import java.io.IOException;
import java.util.Scanner;

public class ChatClient2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Client client=new Client();
        client.start();
        String message;

        while(true){
            System.out.print("Send Message to the Server: ");
            message = sc.nextLine();
            client.sendMessage(message,"2");
            if(message.equalsIgnoreCase("Bye"))
                break;

        }

        System.out.println("Client finished the execution");



    }
}
