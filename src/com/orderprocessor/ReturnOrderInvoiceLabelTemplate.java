package com.orderprocessor;

public abstract class ReturnOrderInvoiceLabelTemplate {

    public final void buildInvoiceLabel(String returnOrderMessage){
        buildReturnOrderHeaderInfo();
        buildReturnOrderTaxesAmount();
        buildReturnOrderHandlingCharges();
        buildReturnOrderTotalQuantity(returnOrderMessage);
        buildReturnOrderFooterInfo();
    }

    private void buildReturnOrderHeaderInfo(){
        System.out.println("buildReturnOrderHeaderInfo");
    }

    private void buildReturnOrderFooterInfo(){
        System.out.println("buildReturnOrderFooterInfo");
    }

    public abstract void buildReturnOrderTaxesAmount();

    public abstract void buildReturnOrderHandlingCharges();

    public abstract void buildReturnOrderTotalQuantity(String returnOrderMessage);

    /*
    Returns Total Quantity In Words to print in Return Orders Invoice
     */
    public String getReturnsTotalQuantityInWords(String returnOrderMessage){

        // strings at index 0 is not used, it is to make array indexing simple
        String[] one = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};

        // strings at index 0 and 1 are not used, they is to make array indexing simple
        String[] ten = {"", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};

        return convertToWords(getTotalQuantity(returnOrderMessage),ten,one);

    }

    private int getTotalQuantity(String returnOrderMessage){
        return 290;
    }

    // Function to print a given number in words
    private String convertToWords(int n,String[] ten,String[] one)
    {
        // stores word representation of given number n
        String out="";

        // handles digits at ten millions and hundred
        // millions places (if any)
        out += numToWords((n/10000000), "10 million ",ten,one);

        // handles digits at hundred thousands and one
        // millions places (if any)
        out += numToWords(((n/100000) % 100), "lakh ",ten,one);

        // handles digits at thousands and tens thousands
        // places (if any)
        out += numToWords(((n/1000) % 100), "thousand ",ten,one);

        // handles digit at hundreds places (if any)
        out += numToWords(((n/100) % 10), "hundred ",ten,one);



        if ((n > 100) && (n%100>0))
        {
            out += "and ";
        }

        // handles digits at ones and tens places (if any)
        out += numToWords((n%100), "",ten,one);

        return out;
    }

    private String numToWords(int n, String s,String[] ten,String[] one)
    {
        String str = "";
        // if n is more than 19, divide it
        if (n > 19)
        {
            str += ten[n / 10] + one[n % 10];
        }
        else
        {
            str += one[n];
        }

        // if n is non-zero
        if (n != 0)
        {
            str += s;
        }

        return str;
    }
}
