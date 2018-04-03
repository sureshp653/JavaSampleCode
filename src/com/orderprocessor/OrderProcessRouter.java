package com.orderprocessor;

public class OrderProcessRouter {

    private static volatile OrderProcessRouter orderProcessRouterInstance = null;

    private OrderProcessRouter(){

    }

    public static OrderProcessRouter getInstance(){
        if(orderProcessRouterInstance==null){
            synchronized (OrderProcessRouter.class) {
                orderProcessRouterInstance = new OrderProcessRouter();
            }
        }
        return orderProcessRouterInstance;
    }

    public MessageProcessorFactory getMessageProcessor(String orderMessage){
        MessageProcessorFactory messageProcessor=null;

        switch (MessageProcessorUtil.getMessageType(orderMessage)){
            case MessageProcessorUtil.CONTAINER:
                messageProcessor = new ContainerMessageProcessor();
                break;
            case MessageProcessorUtil.RETURNS:
                messageProcessor = new ReturnsMessageProcessor();
                break;
            case MessageProcessorUtil.PRODUCT:
                messageProcessor = new ProductMessageProcessor();
                break;
        }

        System.out.println(MessageType.CONTAINER);
        return messageProcessor;
    }

    public int getStationId(String orderMessage){
        return 004;
    }
}
