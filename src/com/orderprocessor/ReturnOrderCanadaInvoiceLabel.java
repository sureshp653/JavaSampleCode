package com.orderprocessor;

public class ReturnOrderCanadaInvoiceLabel extends ReturnOrderInvoiceLabelTemplate {

    public void buildReturnOrderTotalQuantity(String returnOrderMessage){
        getReturnsTotalQuantityInWords(returnOrderMessage);
        System.out.println("buildReturnOrderTotalQuantity for Canada");
    }

    public void buildReturnOrderHandlingCharges(){
        System.out.println("buildReturnOrderHandlingCharges for Canada");
    }

    public void buildReturnOrderTaxesAmount(){
        System.out.println("buildReturnOrderTaxesAmount for Canada");
    }
}

