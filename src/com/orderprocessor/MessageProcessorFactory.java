package com.orderprocessor;

public interface MessageProcessorFactory {
    int noOfStations = 20;

    default int getRouteStationId(int stationId){
        return stationId%noOfStations;
    }

    void invokeMessageService(int stationId,String returnOrderMessage);

}
