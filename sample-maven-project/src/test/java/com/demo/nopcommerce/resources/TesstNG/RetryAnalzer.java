package com.demo.nopcommerce.resources.TesstNG;

import org.testng.IRetryAnalyzer;

public class RetryAnalzer implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount =3;
    @Override
    public boolean retry ()
