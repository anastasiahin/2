package com.example;

import com.google.gson.JsonObject;

public class Main {
    public static void main(String[] args) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Anastasia");
        jsonObject.addProperty("lastName", "Hinailo");

        System.out.println(jsonObject.toString());
    }
}
