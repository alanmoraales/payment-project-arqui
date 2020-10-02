import dao.TransactionInfoDao;
import dao.TransactionInfoMongo;
import transactionInfo.TransactionInfo;

import java.util.Date;

public class MongoTest {
    public static void main(String[] args) {
        TransactionInfoDao mongo = new TransactionInfoMongo();
        TransactionInfo fakeInfo = new TransactionInfo();

        fakeInfo.setClientName("Alan Morales");
        fakeInfo.setAmount(400.50);
        fakeInfo.setDate(new Date());
        fakeInfo.setPaymentConcept("test");
        fakeInfo.setTransactionId("testid231");

        boolean infoWasSaved = mongo.save(fakeInfo);

        if(infoWasSaved) {
            System.out.println("information was saved");
        } else {
            System.out.println("something went wrong");
        }
    }
}
