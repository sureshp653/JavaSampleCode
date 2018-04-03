package com.orderprocessor;

public enum MessageType {
    CONTAINER {
        @Override
        public String toString(){
            return "Container";
        }
    },
    PRODUCT {
        @Override
        public String toString(){
            return "Product";
        }
    },
    RETURNS{
        @Override
        public String toString(){
            return "Returns";
        }
    };
}

