package com.orderprocessor;

public class Main {

    public static void main(String[] args) {

        // This is one of my Proudly saying sample Java Code program in which I used Object Oriented Programming features
        // Java 8 Interfaces,Abstract classes,Design Patterns are SingleTon,Factory and Template.
        // One more complex Java code which I implemented is converting Number to Word format String
        // Ex: 9078 converts to "nine thousand and seventy eight"
        // even if the number is one Crore or 10 Million, my algorithm with describe into word format
        // in Abstract class ReturnOrderInvoiceLabelTemplate.


        String orderMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Order UserId=\"Spasup\" ShipNode=\"CANADA\">\n" +
                "\t<ReturnOrders>\n" +
                "\t\t<ReturnOrder Qty=\"1\" ReturnOrderNumber=\"R1\" Product=\"P1\"/>\n" +
                "\t\t<ReturnOrder Qty=\"3\" ReturnOrderNumber=\"R2\" Product=\"P2\"/>\n" +
                "\t\t<ReturnOrder Qty=\"4\" ReturnOrderNumber=\"R3\" Product=\"P3\"/>\n" +
                "\t\t<ReturnOrder Qty=\"8\" ReturnOrderNumber=\"R4\" Product=\"P4\"/>\t\t\n" +
                "\t</ReturnOrders>\t\n" +
                "</Order>";

	    // OrderProcessRouter is SingleTon(SingleTon Design Pattern) class and

	    OrderProcessRouter orderProcessRouter = OrderProcessRouter.getInstance();

	    //provide the ReturnsMessageProcessor class from Factory(Factory Design Pattern) Classes

        MessageProcessorFactory messageProcessorFactory = orderProcessRouter.getMessageProcessor(orderMessage);

        // Calling the ReturnLabelInvoice Template(Template Design Pattern) based on Market Country.
        messageProcessorFactory.invokeMessageService(orderProcessRouter.getStationId(orderMessage),orderMessage);

    }
}
