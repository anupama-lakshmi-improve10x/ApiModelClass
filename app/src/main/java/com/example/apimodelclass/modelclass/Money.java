package com.example.apimodelclass.modelclass;

import com.google.gson.annotations.SerializedName;

public class Money {

    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;
}
