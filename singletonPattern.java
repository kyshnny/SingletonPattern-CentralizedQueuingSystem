/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Shania Mae Ucag
 */
public class singletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        centralizedQueuingSystem queuingsystem = centralizedQueuingSystem.getInstance();
        
        helpDesk station1 = new helpDesk(1);
        helpDesk station2 = new helpDesk(2);
        helpDesk station3 = new helpDesk(3);
        
        queuingsystem.addHelpDeskStation(station1);
        queuingsystem.addHelpDeskStation(station2);
        queuingsystem.addHelpDeskStation(station3);
        
        System.out.println("New Queue Number: " + queuingsystem.generateQueueNo());
        System.out.println("New Queue Number: " + queuingsystem.generateQueueNo());
        System.out.println();
        
        for (helpDesk station : queuingsystem.getHelpDeskStations()) {
            System.out.println("Station " + station.getStationId() + " Current Queue Number: " + station.getCurrentQueueNo());
        }
        System.out.println();
        
        queuingsystem.resetQueueNo(1, 10);
        System.out.println("Station 1 Queue Number Reset to: " + station1.getCurrentQueueNo());
        System.out.println();
        
        queuingsystem.completeQueueNo();
        System.out.println("Current Queue Number after completion: " + queuingsystem.getCurrentQueueNo());
        
        System.out.println("Completed Queue Numbers: " + queuingsystem.getCompletedQueueNumbers());
    }
    
}
