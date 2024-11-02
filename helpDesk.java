/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Shania Mae Ucag
 */
public class helpDesk {
    private int stationId;
    private int currentQueueNo;
    
    public helpDesk(int stationId){
        this.stationId = stationId;
        this.currentQueueNo = 0;
    }
    
    public void resetQueue(int newNo){
        this.currentQueueNo = newNo;
    }
    
    public int getCurrentQueueNo(){
        return currentQueueNo;
    }
    
    public int getStationId(){
        return stationId;
    }
    
}
