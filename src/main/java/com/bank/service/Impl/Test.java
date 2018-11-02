package com.bank.service.Impl;

import com.bank.utils.DateControlForLoan;

public class Test {
    public static void main(String [] args){
        System.out.println( DateControlForLoan.isValidDate("2017-4-31 23:59:59"));
        System.out.println( DateControlForLoan.getExpirationDate(15));
    }
}
