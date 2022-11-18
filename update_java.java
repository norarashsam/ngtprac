import com.mongodb.client.MongoCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.WriteResult;
import java.net. UnknownHostException;

public class update
{
	public static void main(String args[])
	{
		MongoClient mongo = new MongoClient("localhost", 27017);
		System.out.println(" Connected to the database successfully");
		DB db = mongo.getDB("TYITBC");
		DBCollection col = db.getCollection("TYITCOLL");
		DBObject query = new BasicDBObject("id", 1);
		DBObject update = new BasicDBObject();
		update.put("$set", new BasicDBObject("Age",35));
		WriteResult result = col.update(query, update);
		mongo.close();
	}
}