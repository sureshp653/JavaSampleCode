package com.orderprocessor;

public class ContainerMessageProcessor implements MessageProcessorFactory {

    @Override
    public void invokeMessageService(int stationId,String returnOrderMessage){

        System.out.println(MessageProcessorUtil.INBOUND+MessageType.CONTAINER+MessageProcessorUtil.HIPHEN+getRouteStationId(stationId));
    }
}
