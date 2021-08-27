package com.main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.main.model.MyObject;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		System.out.println("Start example...");

		//instance MyObject and Map
		MyObject myObject = new MyObject();
		Map<String, Object> map = new HashMap<String, Object>();

		map.put("age", 4);
		map.put("Brother", "Luca");

		myObject.setMsisdn("56947891239");
		myObject.setPo("Mr Popo");
		myObject.setAction("Play with the ball");
		myObject.setResponseValue(map);

		//transform the object MyObject to Gson object and transform to a String with json format.
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json = gson.toJson(myObject);

		System.out.println("json ::: " + json);

		//transform the String to a MyObject object
		MyObject jsonObject = new Gson().fromJson(json, MyObject.class);
		System.out.println("Object :::" + jsonObject.getPo());

		System.out.println("Exit");
	}
}
