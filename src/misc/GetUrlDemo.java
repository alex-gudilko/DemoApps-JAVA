/**
 * Description:
 * Application prompts user to enter a bookmark number and outputs
 * URL for selected bookmark. Uses internal method and bookmark table.
 * 
 * @author Alex Gudilko
 * email: gudilkoalex@gmail.com
 * 
 * Version	Description
 * 1.0		Initial design
 * 
 */

package misc;

import java.util.Scanner;

public class GetUrlDemo {

	public static String getUrlAddr(int bookmarkNumber){
		
		String urlAddr = " ";
		boolean urlFound = false;
		String[] bookmarkTable = {"google.com", "yahoo.com", "facebook.com", "vk.com", "apple.com"};

		switch(bookmarkNumber){
			case 1: urlAddr = bookmarkTable[0];
					urlFound = true;
					break;
			case 2: urlAddr = bookmarkTable[1];
					urlFound = true;
					break;
			case 3: urlAddr = bookmarkTable[2];
					urlFound = true;
					break;
			case 4: urlAddr = bookmarkTable[3];
					urlFound = true;
					break;
			case 5: urlAddr = bookmarkTable[4];
					urlFound = true;
					break;
			default: urlAddr = "URL not defined";
					urlFound = false;
					break;
		}
		
		return urlAddr;
		
	}
	
	public static void main(String[] args) {

//		int bookmarkNumber = 3;
		
		// Prompt user to input bookmark number
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a bookmark number (1..5): "); // Print an instruction for user
		int bookmarkNumber = reader.nextInt(); // Scans for bookmark number (integer)
		System.out.println("You selected #" + bookmarkNumber + " bookmark"); // Output entered number
		
		// Get and output URL for chosen bookmark
		String returnedUrlAddr = GetUrlDemo.getUrlAddr(bookmarkNumber);
	
		System.out.println("Bookmark URL: " + returnedUrlAddr);
		

	}

}
