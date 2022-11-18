import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb. MongoCredential;
import org.bson.Document;
import com.mongodb.client.model.Filters;

public class delete
{
	public static void main(String args[])
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		System.out.println(" Connected to the database successfully");
		MongoDatabase database = mongo.getDatabase("TYITBC");
		MongoCollection<Document> collection = database.getCollection("TYITCOLL");
		System.out.println(" Collection TYICOLL selected successfully");
		collection.deleteOne(Filters.eq("id",1));
		System.out.println(" Document deleted successfully");
	}
}