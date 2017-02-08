/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mustangbanking;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author jcl160030
 */
public class MustangBanking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit)
		{
		System.out.println("Welcome to your Mustang Bank! Please choose from the following options: ");
		printMenu();
		int option = in.nextInt();
		switch(option)
		case 1:
		
		break;
		case 2:
		
		break;
		case 3:
		
		break;
		case 4:
		
		break;
		case 5:
		
		break;
		case 6:
		
		break;
		case 7:
		
		break;
		case 8:
		
		break;
		case 9:
		exit = true;
		break;
		}
		
    }
	
	public void printMenu()
	{
		System.out.println("1 - Create a new Checking Account\n2 - Create a new Savings Account\n3 - Delete an existing account\n4 - View a specific account\n5 - View all accounts\n6 - Write a check through a specific Checking Account\n7 - Withdraw funds from a specific account\n8 - Deposit funds into an account\n9 - Exit Program\nPlease enter your option below:");
	}

}
