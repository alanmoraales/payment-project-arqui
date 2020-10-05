package dao;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import config.MongoConfig;
import org.bson.Document;
import transactionInfo.ITransactionInfo;

public class TransactionInfoMongo implements TransactionInfoDao{
    private final MongoDatabase mongo;
    private final String collectionName = "transactions";

    public TransactionInfoMongo() {
        ConnectionString connString = new ConnectionString(MongoConfig.MONGO_URI);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        mongo = mongoClient.getDatabase("gradle-java-test");
    }

    @Override
    public boolean save(ITransactionInfo transactionInfo) {
        try {
            Document doc = new Document("clientName", transactionInfo.getClientName())
                    .append("id", transactionInfo.getTransactionId())
                    .append("paymentMethod", transactionInfo.getPaymentMethod())
                    .append("date", transactionInfo.getDate())
                    .append("concept", transactionInfo.getPaymentConcept())
                    .append("amount", transactionInfo.getAmount());

            mongo.getCollection(collectionName).insertOne(doc);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
