package com.orderprocessor;

public class ProductMessageProcessor implements MessageProcessorFactory {

    @Override
    public void invokeMessageService(int stationId,String returnOrderMessage){
        System.out.println(MessageProcessorUtil.INBOUND+MessageType.PRODUCT+MessageProcessorUtil.HIPHEN+getRouteStationId(stationId));
    }
}
