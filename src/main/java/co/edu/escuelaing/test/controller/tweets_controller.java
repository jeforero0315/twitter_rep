/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.test.controller;

import co.edu.escuelaing.test.models.tweets;
import co.edu.escuelaing.test.services.tweets_services;
import com.google.gson.Gson;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.options;
import static spark.Spark.post;

/**
 *
 * @author Jeniffer
 */
public class tweets_controller {
    
    public List<tweets> tweets_controller_services(){
        
        
        
        
        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");

            if (accessControlRequestHeaders != null) {

                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);

            }
 
            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");

            if (accessControlRequestMethod != null) {

                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);

            }
 
            return "OK";

        });
 
        before((request, response) -> {

            response.header("Access-Control-Allow-Origin", "*");

            response.header("Access-Control-Request-Method", "GET, POST, PUT, DELETE");

            response.header("Access-Control-Allow-Headers", "Content-Type, Authorization");

        });


        Gson gson = new Gson();
        tweets_services service = new tweets_services();
        
        
        get("/tweets", (req, res)-> {
            
            res.type("application/json");
            return service.tweets_stream();
        },gson::toJson);
        
        
        return service.tweets_stream();
                
        
        
    }
    
    
    public String post_controller(){
        
        Gson gson = new Gson();
        tweets_services service = new tweets_services();
        
        post("/tweets", (req, res)->{
            res.type("application/json");
            tweets tw = gson.fromJson(req.body(), tweets.class);
            UUID id = UUID.randomUUID();
            String id_value = id.toString();
            tw.setTweets_id(id_value);
            tw.setTweets_time(LocalDateTime.now());
            return service.newTweet(tw);
        },gson::toJson);
        
        return "Tweet publicado!";
    }
    
    
}
