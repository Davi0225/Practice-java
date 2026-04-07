package Prac;

	import java.util.Scanner;

	public class HotelReservation2D {
	    public static void main(String[] args) {
	        int[][] rooms = new int[7][5];
	        int userChoice = 0;
	        int selectedFloor = 0;
	        int selectedRoom = 0;
	        Scanner scanner = new Scanner(System.in);

	        do {
	            System.out.print("=== HOTEL RESERVATION SYSTEM ===\n" +
	                             "1. View Rooms\n" +
	                             "2. Check In\n" +
	                             "3. Check Out\n" +
	                             "4. Exit\n" +
	                             "Enter Choice: ");
	            userChoice = scanner.nextInt();
	            System.out.println();

	            switch (userChoice) {
	                case 1:
	                    for (int i = 0; i < rooms.length; i++) {
	                        System.out.print("Floor " + (i + 1) + ": ");
	                        for (int j = 0; j < rooms[i].length; j++) {
	                            System.out.print("[" + rooms[i][j] + "]");
	                        }
	                        System.out.println();
	                    }
	                    System.out.println();
	                    break;

	                case 2:
	                    System.out.print("Enter floor (1-7): ");
	                    selectedFloor = scanner.nextInt() - 1;
	                    System.out.print("Enter room (1-5): ");
	                    selectedRoom = scanner.nextInt() - 1;
	                    if (rooms[selectedFloor][selectedRoom] == 0) {
	                        rooms[selectedFloor][selectedRoom] = 1;
	                        System.out.println("Check-in successful!");
	                    } else {
	                        System.out.println("Room is already occupied.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter floor (1-7): ");
	                    selectedFloor = scanner.nextInt() - 1;
	                    System.out.print("Enter room (1-5): ");
	                    selectedRoom = scanner.nextInt() - 1;
	                    if (rooms[selectedFloor][selectedRoom] == 1) {
	                        rooms[selectedFloor][selectedRoom] = 0;
	                        System.out.println("Check-out successful!");
	                    } else {
	                        System.out.println("Room is already empty.");
	                    }
	                    break;
	            }
	        } while (userChoice != 4);

	        System.out.println("See you next time!");
	        scanner.close();
	    }
	}   