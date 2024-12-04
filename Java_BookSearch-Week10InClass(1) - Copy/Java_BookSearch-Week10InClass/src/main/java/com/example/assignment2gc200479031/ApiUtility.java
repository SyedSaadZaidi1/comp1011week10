package com.example.assignment2gc200479031;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ApiUtility {
    public static void ApiResponse getBooksFromJSONFile(String fileName){
        Gson gson = new Gson();
        ApiResponse apiResponse = null;

        try (
                FileReader fileReader = new FileReader(fileName);
                JsonReader jsonReader = new JsonReader(fileReader);

                ){
            apiResponse = gson.fromJson(jsonReader, ApiResponse.class);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(apiResponse);
        return apiResponse;


    }

    public static ApiResponse getBooksFromOMDB(String searchTerm){
        searchTerm = searchTerm.replace("", "%20");

        String uri = "";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(uri)).build();

        try{
            HttpsResponse<Path> response = client.send(HttpsRequest, HttpResponse
                    .BodyHandler
                    .offFile(Paths.get("javaApiFetched.json")));

        }catch(Exception e){
            e.printStackTrace();
        }
        return getBooksFromOMDB("javaApiFetched.json");
    }

}
