package com.orderprocessor;

public class ReturnOrderUKInvoiceLabel extends ReturnOrderInvoiceLabelTemplate {

    public void buildReturnOrderTotalQuantity(String returnOrderMessage){
        getReturnsTotalQuantityInWords(returnOrderMessage);
        System.out.println("buildReturnOrderTotalQuantity for United Kingdom");
    }

    public void buildReturnOrderHandlingCharges(){
        System.out.println("buildReturnOrderHandlingCharges for United Kingdom");
    }

    public void buildReturnOrderTaxesAmount(){
        System.out.println("buildReturnOrderTaxesAmount for United Kingdom");
    }
}

