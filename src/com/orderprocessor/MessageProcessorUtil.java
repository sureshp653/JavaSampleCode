package com.orderprocessor;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.StringReader;
import org.xml.sax.InputSource;

public interface MessageProcessorUtil {
    static final String HIPHEN = "-";
    static final String INBOUND = "Inbound";
    static final String CONTAINER = "container";
    static final String RETURNS = "Returns";
    static final String PRODUCT = "Product";
    static final String USA = "USA";
    static final String UK = "UK";
    static final String CANADA = "CANADA";

    static String getMessageType(String orderMessage){
        Document docOrderMessage = convertStringToDocument(orderMessage);
        return docOrderMessage.getDocumentElement().getAttribute("MessageType");
    }

    static Document convertStringToDocument(String xmlStr) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new InputSource(new StringReader(xmlStr)));
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static int getStationId(String orderMessage){
        return 004;
    }


}
