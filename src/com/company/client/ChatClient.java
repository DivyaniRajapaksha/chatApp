package com.company.client;

import java.io.*;
import java.util.Scanner;

public class ChatClient  {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Client client=new Client();
        client.start();
        String msg;

        while(true){
            System.out.print("Send Message to the Server: ");

            msg = sc.nextLine();
            client.sendMessage(msg,"1");
            if(msg.equalsIgnoreCase("Bye"))
                break;

        }

        System.out.println("Client finished the execution");

    }
}
