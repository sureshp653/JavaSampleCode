package com.orderprocessor;

public class ReturnOrderUSAInvoiceLabel extends ReturnOrderInvoiceLabelTemplate {

    public void buildReturnOrderTotalQuantity(String returnOrderMessage){
        getReturnsTotalQuantityInWords(returnOrderMessage);
        System.out.println("buildReturnOrderTotalQuantity for USA");
    }

    public void buildReturnOrderHandlingCharges(){
        System.out.println("buildReturnOrderHandlingCharges for USA");
    }

    public void buildReturnOrderTaxesAmount(){
        System.out.println("buildReturnOrderTaxesAmount for USA");
    }
}

