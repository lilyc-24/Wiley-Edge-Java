package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        //could you modulise this to the locations so its easier to sort and read

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        //open mailbox
        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();
            
            //look inside mailbox
            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();
                
                //keep looking in mailbox
                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                //run away from mailbox
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            
            //hand in mailbox
            } else if (action.equals("stick your hand in")) { 
            	System.out.println("You feel something grap you pulling you in.");
            	System.out.println("So much darkness...");
            	System.out.println("Keep going or let go?");
            	action = userInput.nextLine();
            	
            	if (action.equals("Keep going")){
            		System.out.println("I think this a tentacle holding me...");
            		System.out.println("There's a light further ahead but I'm starting to get lightheaded.");
            		System.out.println("You run out of oxygen.");
            	}
            	else if(action.equals("let go")){
            		System.out.println("You feel the grip loosen and the second it does you tear off to the field.");
            		System.out.println("Probably for the best");
            	}
            }
           
        } else if (action.equals("go to the house")) { }
    }
}