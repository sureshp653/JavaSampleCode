package com.orderprocessor;

public class ReturnsMessageProcessor implements MessageProcessorFactory {

    @Override
    public void invokeMessageService(int stationId,String returnOrderMessage){

        ReturnOrderInvoiceLabelTemplate returnOrderInvoiceLabelTemplate = getReturnOrderInvoiceTemplate(returnOrderMessage);

        System.out.println(MessageProcessorUtil.INBOUND+MessageType.PRODUCT+MessageProcessorUtil.HIPHEN+getRouteStationId(stationId));

        returnOrderInvoiceLabelTemplate.buildInvoiceLabel(returnOrderMessage);
    }

    public ReturnOrderInvoiceLabelTemplate getReturnOrderInvoiceTemplate(String returnOrderMessage){
        String returnOrderCountry = getReturnOrderCountry(returnOrderMessage);

        ReturnOrderInvoiceLabelTemplate returnOrderInvoiceLabelTemplate = null;

        switch (returnOrderCountry){
            case MessageProcessorUtil.UK:
                returnOrderInvoiceLabelTemplate = new ReturnOrderUKInvoiceLabel();
                break;
            case MessageProcessorUtil.USA:
                returnOrderInvoiceLabelTemplate = new ReturnOrderUSAInvoiceLabel();
                break;
            case MessageProcessorUtil.CANADA:
                returnOrderInvoiceLabelTemplate = new ReturnOrderCanadaInvoiceLabel();
                break;
        }
        return returnOrderInvoiceLabelTemplate;
    }

    private String getReturnOrderCountry(String returnOrderMessage){
        return "USA";
    }


}
