package main;

import javax.swing.JOptionPane;

public class HotelReservation2D {

    public static void main(String[] args) {
        int[][] rooms = new int[7][5];
        String userChoice = "";

        do {
            userChoice = JOptionPane.showInputDialog(null,
                "Welcome to Hotel Reservation\n\n" +
                "1. View Rooms\n" +
                "2. Check In\n" +
                "3. Check Out\n" +
                "4. Exit\n\n" +
                "Enter Choice: ",
                "System Message",
                JOptionPane.INFORMATION_MESSAGE);

            switch (userChoice) {
                case "1":
                    StringBuilder viewMessage = new StringBuilder("Room Status:\n");
                    for (int i = 0; i < rooms.length; i++) {
                        viewMessage.append("Floor ").append(i + 1).append(": ");
                        for (int j = 0; j < rooms[i].length; j++) {
                            viewMessage.append("[").append(rooms[i][j]).append("] ");
                        }
                        viewMessage.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, viewMessage.toString());
                    break;

                case "2":
                    String selectedFloor = JOptionPane.showInputDialog(null, "Enter floor (1-7): ", "Floor Number", JOptionPane.QUESTION_MESSAGE);
                    if (selectedFloor == null) break;

                    String selectedRoom = JOptionPane.showInputDialog(null, "Enter room (1-5): ", "Room Number", JOptionPane.QUESTION_MESSAGE);
                    if (selectedRoom == null) break;

                    int floor = Integer.parseInt(selectedFloor) - 1;
                    int room = Integer.parseInt(selectedRoom) - 1;

                    if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
                        if (rooms[floor][room] == 0) {
                            rooms[floor][room] = 1;
                            JOptionPane.showMessageDialog(null, "Check-in successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Room is already occupied", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid floor or room number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "3":
                    selectedFloor = JOptionPane.showInputDialog(null, "Enter floor (1-7): ", "Floor Number", JOptionPane.QUESTION_MESSAGE);
                    if (selectedFloor == null) break;

                    selectedRoom = JOptionPane.showInputDialog(null, "Enter room (1-5): ", "Room Number", JOptionPane.QUESTION_MESSAGE);
                    if (selectedRoom == null) break;

                    floor = Integer.parseInt(selectedFloor) - 1;
                    room = Integer.parseInt(selectedRoom) - 1;

                    if (floor >= 0 && floor < 7 && room >= 0 && room < 5) {
                        if (rooms[floor][room] == 1) {
                            rooms[floor][room] = 0;
                            JOptionPane.showMessageDialog(null, "Check-out successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Room is already empty.", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid floor or room number.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                case "4":
                    JOptionPane.showMessageDialog(null, "See you next time!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    if (userChoice != null) {
                        JOptionPane.showMessageDialog(null, "Invalid choice. Please enter 1, 2, 3, or 4.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
            }
        } while (!userChoice.equals("4"));
    }
}   