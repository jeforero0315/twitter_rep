/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.test.handler;

import co.edu.escuelaing.test.controller.tweets_controller;
import co.edu.escuelaing.test.models.tweets;
import java.util.List;

/**
 *
 * @author Jeniffer
 */
public class tweet_handler {
    
    public List<tweets> getMethod(){
    tweets_controller controller = new tweets_controller();
    List <tweets> result = controller.tweets_controller_services();
    return result;
    
    }
    
    public String post_method(){
    tweets_controller controller = new tweets_controller();
    String val = controller.post_controller();
    return val;
}
    
}
