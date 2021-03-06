package com.goubaa.harry.nightplus.Base;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by harry on 2018/1/24.
 */

public class BaseEntity<T> {
  @SerializedName("code")
  private int code;
  @SerializedName("status")
  private String status;
  @SerializedName("data")
  private ArrayList<T> data;
  @SerializedName("serverTime")
  private long serverTime;

  public boolean isSuccess() {
    return code == 200;
  }

  public String getStatus() {
    return status;
  }

  public long getServerTime() {
    return serverTime;
  }

  public int getCode() {
    return code;
  }

  public ArrayList<T> getData() {
    return data;
  }
}
