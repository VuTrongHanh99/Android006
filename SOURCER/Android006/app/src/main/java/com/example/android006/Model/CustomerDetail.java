package com.example.android006.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomerDetail {

@SerializedName("customerName")
@Expose
public String customerName;
@SerializedName("phone")
@Expose
public String phone;
@SerializedName("point")
@Expose
public Integer point;
@SerializedName("isNeedUpdate")
@Expose
public Integer isNeedUpdate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName( String customerName ) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint( Integer point ) {
        this.point = point;
    }

    public Integer getIsNeedUpdate() {
        return isNeedUpdate;
    }

    public void setIsNeedUpdate( Integer isNeedUpdate ) {
        this.isNeedUpdate = isNeedUpdate;
    }
}