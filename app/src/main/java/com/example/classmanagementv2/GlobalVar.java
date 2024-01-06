package com.example.classmanagementv2;

import android.content.Context;

public class GlobalVar {
    public static String userName;
    public static String userSID;
    public static String userMID;

    public static String result = "None";
    public static String status = "None";
    public static DataProductLine[] cart = new DataProductLine[10];
    public static DataProductLine[] Ordered = new DataProductLine[10];

    public static Context mainActivityContext;
}
