/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.escuelaing.test.services;

import co.edu.escuelaing.test.models.tweets;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author Jeniffer
 */
public class tweets_services {
    
    private final String mongoUri = "mongodb://jenifferpforero:5T2xE88AJ39OYWkF@ac-id18omo-shard-00-00.rgezkxw.mongodb.net:27017,ac-id18omo-shard-00-01.rgezkxw.mongodb.net:27017,ac-id18omo-shard-00-02.rgezkxw.mongodb.net:27017/tweets?ssl=true&replicaSet=atlas-94uw40-shard-0&authSource=admin&retryWrites=true&w=majority";
    MongoClientURI client = new MongoClientURI(mongoUri);
    MongoClient mongoClient = new MongoClient(client);
    Datastore store = new Morphia().createDatastore(mongoClient, "Twitter");
    
    public String newTweet(tweets tw){
        
        store.save(tw);
        return "Haz publicado un tweet!";
        
    }
    
    public List<tweets> tweets_stream(){
        
        List<tweets> list = store.find(tweets.class).asList();
        if (list != null){
            return list;
        }
        return null;
    }
           
}
