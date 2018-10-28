package me.todayilearnt.trsis.datasources;

import com.mongodb.MongoClient;
import me.todayilearnt.trsis.models.StoreItem;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

public class MongoConnection {
    private static Datastore instance;

    public static synchronized Datastore getInstance() {
        if (instance == null) {
            instance = createDatastore();
        }
        return instance;
    };

    private static Datastore createDatastore() {
        final Morphia morphia = new Morphia();
        morphia.map(StoreItem.class);
        return morphia.createDatastore(new MongoClient(), "to_buy_list");
    }
}
