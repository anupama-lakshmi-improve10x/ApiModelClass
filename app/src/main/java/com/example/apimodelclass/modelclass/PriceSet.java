package com.example.apimodelclass.modelclass;

import com.google.gson.annotations.SerializedName;

public class PriceSet {
    @SerializedName("shop_money")
    private Money shopMoney;
    @SerializedName("presentment_money")
    private Money presentmentMoney;
}
