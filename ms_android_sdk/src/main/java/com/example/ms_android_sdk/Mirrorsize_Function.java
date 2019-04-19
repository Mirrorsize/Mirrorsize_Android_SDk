package com.example.ms_android_sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Mirrorsize_Function implements SensorEventListener {

    private SensorManager sensorManager;
    public static int angle;

    public static void MS_initialize_user(Context context, String apikey, String merchantID, String productname, String producttype, String gender, final CallBack callBack)
    {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("apiKey",apikey);
            jsonObject.put("merchantid",merchantID);
            jsonObject.put("productname",productname);
            jsonObject.put("productType",producttype);
            jsonObject.put("gender",gender);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        if (jsonObject.length()>0)
        {
            String api = "https://mobile.msways.com/api/ms_initialize_user";
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, api, jsonObject, new Response.Listener<JSONObject>()
            {
                @Override
                public void onResponse(JSONObject response) {

                    callBack.onSuccess(response.toString());
                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    callBack.onError(error);
                }
            })
            {
                /**
                 * Passing some request headers
                 */
                @Override
                public Map<String, String> getHeaders() {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            // Adding request to request queue
            Volley.newRequestQueue(context).add(jsonObjReq);
        }
    }

    public static void MS_measurement_Process_loosefit(Context context, String userid, int angle, int height, int weight, int age, String gender, String productname, String username, String usermobile, String apikey,String frontimage, String sideimage, String merchantID, String mobilemodel,final CallBack callBack)
    {
        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("userId",userid);
            jsonObject.put("angle" ,angle);
            jsonObject.put("height",height);
            jsonObject.put("weight",weight);
            jsonObject.put("age",age);
            jsonObject.put("gender",gender);
            jsonObject.put("productname",productname);
            jsonObject.put("userName",username);
            jsonObject.put("userMobile",usermobile);
            jsonObject.put("apiKey",apikey);
            jsonObject.put("frontImage",frontimage);
            jsonObject.put("sideImage" ,sideimage);
            jsonObject.put("merchantid",merchantID);
            jsonObject.put("mobilemodel",mobilemodel);
            jsonObject.put("fitType","loosefit");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (jsonObject.length() > 0)
        {
            String api = "https://mobile.msways.com/api/ms_measurement_process";
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, api, jsonObject, new Response.Listener<JSONObject>()
            {
                @Override
                public void onResponse(JSONObject response) {


                    callBack.onSuccess(response.toString());
                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    callBack.onError(error);
                }
            })
            {
                /**
                 * Passing some request headers
                 */
                @Override
                public Map<String, String> getHeaders() {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            // Adding request to request queue
            jsonObjReq.setRetryPolicy(new DefaultRetryPolicy(120000,0,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            Volley.newRequestQueue(context).add(jsonObjReq);
        }

    }

    public static void MS_measurement_Process_tightfit(Context context, String userid, int angle, int height, String gender, String productname, String username, String usermobile, String apikey,String frontimage, String sideimage, String merchantID, String mobilemodel,final CallBack callBack)
    {
        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("userId",userid);
            jsonObject.put("angle",angle);
            jsonObject.put("height",height);
            jsonObject.put("weight","75");
            jsonObject.put("age","25");
            jsonObject.put("gender",gender);
            jsonObject.put("productname",productname);
            jsonObject.put("userName",username);
            jsonObject.put("userMobile",usermobile);
            jsonObject.put("apiKey",apikey);
            jsonObject.put("frontImage",frontimage);
            jsonObject.put("sideImage",sideimage);
            jsonObject.put("merchantid",merchantID);
            jsonObject.put("mobilemodel",mobilemodel);
            jsonObject.put("fitType","tightfit");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (jsonObject.length() > 0)
        {
            String api = "https://mobile.msways.com/api/ms_measurement_process";
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, api, jsonObject, new Response.Listener<JSONObject>()
            {
                @Override
                public void onResponse(JSONObject response) {


                    callBack.onSuccess(response.toString());
                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    callBack.onError(error);
                }
            })
            {
                /**
                 * Passing some request headers
                 */
                @Override
                public Map<String, String> getHeaders() {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            // Adding request to request queue
            jsonObjReq.setRetryPolicy(new DefaultRetryPolicy(120000,0,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
            Volley.newRequestQueue(context).add(jsonObjReq);
        }

    }

    public static void MS_GetMeasurement(Context context, String apiKey, String apparelName, String brandName, String gender, String merchantID, String productname, String productType, String userID,final CallBack callBack)
    {
        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("apiKey",apiKey);
            jsonObject.put("apparelName",apparelName);
            jsonObject.put("brandName",brandName);
            jsonObject.put("gender",gender);
            jsonObject.put("merchantID",merchantID);
            jsonObject.put("productname",productname);
            jsonObject.put("productType",productType);
            jsonObject.put("userID",userID);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (jsonObject.length() > 0)
        {
            String api = "https://mobile.msways.com/api/ms_getRecommendation";
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, api, jsonObject, new Response.Listener<JSONObject>()
            {
                @Override
                public void onResponse(JSONObject response) {

                    callBack.onSuccess(response.toString());
                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    callBack.onError(error);
                }
            })
            {
                /**
                 * Passing some request headers
                 */
                @Override
                public Map<String, String> getHeaders() {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            // Adding request to request queue
            Volley.newRequestQueue(context).add(jsonObjReq);
        }

    }

    public static void MS_Get_Size_Recommendation(Context context, String apiKey, String apparelName, String brandName, String gender,String merchantID, String productname ,String productType,String userID,final CallBack callBack)
    {
        JSONObject jsonObject = new JSONObject();
        try {

            jsonObject.put("apiKey",apiKey);
            jsonObject.put("apparelName",apparelName);
            jsonObject.put("brandName",brandName);
            jsonObject.put("gender",gender);
            jsonObject.put("merchantID",merchantID);
            jsonObject.put("productname",productname);
            jsonObject.put("productType",productType);
            jsonObject.put("userID",userID);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        if (jsonObject.length() > 0)
        {
            String api = "https://mobile.msways.com/api/ms_getRecommendation";
            JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, api, jsonObject, new Response.Listener<JSONObject>()
            {
                @Override
                public void onResponse(JSONObject response) {

                    callBack.onSuccess(response.toString());
                }
            }, new Response.ErrorListener()
            {
                @Override
                public void onErrorResponse(VolleyError error)
                {
                    callBack.onError(error);
                }
            })
            {
                /**
                 * Passing some request headers
                 */
                @Override
                public Map<String, String> getHeaders() {
                    HashMap<String, String> headers = new HashMap<>();
                    headers.put("Content-Type", "application/json; charset=utf-8");
                    return headers;
                }
            };
            // Adding request to request queue
            Volley.newRequestQueue(context).add(jsonObjReq);
        }
    }

    public void startAngleSensor(Context context)
    {
        sensorManager = (SensorManager)context.getSystemService(Context.SENSOR_SERVICE);
        sensorManager.registerListener(Mirrorsize_Function.this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),1000);
    }

    public void stopSensor(Context context)
    {
        sensorManager = (SensorManager)context.getSystemService(Context.SENSOR_SERVICE);
        sensorManager.unregisterListener( Mirrorsize_Function.this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER));
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float[] g ;
        g = event.values.clone();
        double norm_Of_g = Math.sqrt(g[0] * g[0] + g[1] * g[1] + g[2] * g[2]);
        g[0] = (float) (g[0] / norm_Of_g);
        g[1] = (float) (g[1] / norm_Of_g);
        g[2] = (float) (g[2] / norm_Of_g);
        angle = (int) Math.round(Math.toDegrees(Math.acos(g[2])));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
