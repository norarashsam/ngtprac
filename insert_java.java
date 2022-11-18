import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb. MongoCredential;
import org.bson.Document;
public class insert
{
	public static void main(String args[])
	{
		MongoClient mongo = new MongoClient("localhost",27017);
		System.out.println(" Connected to the database successfully");
		MongoDatabase database = mongo.getDatabase("TYlTBC");
		MongoCollection<Document> collection = database.getCollection("TYITCOLL");
		System.out.println("Collection TYICOLL selected successfully");
		Document document = new Document();
		document.append("id",1);
		document.append("Name","Rohit");
		document.append("RollNo",229667;)
		document.append("Age",20);
		document.append("website","https://www.youtube.com/results?search_query=rohit');
		collection. insertOne(document);
		System.out.println("Document inserted successfully");
	}
}