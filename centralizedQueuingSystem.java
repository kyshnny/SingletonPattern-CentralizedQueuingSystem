/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Shania Mae Ucag
 */
public class centralizedQueuingSystem {
    private static centralizedQueuingSystem instance;
    
    private int currentQueueNo;
    private List<helpDesk> helpDeskStation;
    private List<Integer> completedQueueNumbers;
    
    public centralizedQueuingSystem(){
        this.currentQueueNo = 0;
        this.helpDeskStation = new ArrayList<>();
        this.completedQueueNumbers = new ArrayList<>();
    }
    
    public static centralizedQueuingSystem getInstance(){
        if (instance == null){
            instance = new centralizedQueuingSystem();
        }
        return instance;
    }
    
    public int generateQueueNo(){
        currentQueueNo++;
        return currentQueueNo;
    }
    
    public void resetQueueNo(int stationId, int newNo){
        for(helpDesk station : helpDeskStation){
            if(station.getStationId() == stationId){
                station.resetQueue(newNo);
                break;
            }
        }
    }
    
    public int getCurrentQueueNo(){
        return currentQueueNo;
    }
    
    public void addHelpDeskStation(helpDesk station){
        helpDeskStation.add(station);
    }
    
    public void completeQueueNo(){
        completedQueueNumbers.add(currentQueueNo);
        currentQueueNo++;
    }
    
    public List<Integer> getCompletedQueueNumbers(){
        return completedQueueNumbers;
    }
    
    public List<helpDesk> getHelpDeskStations(){
        return helpDeskStation;
    }
    
}
