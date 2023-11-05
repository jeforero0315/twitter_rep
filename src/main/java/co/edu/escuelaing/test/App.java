package co.edu.escuelaing.test;

import co.edu.escuelaing.test.controller.tweets_controller;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        tweets_controller controller = new tweets_controller();
        controller.tweets_controller_services();
        controller.post_controller();
    }
}
