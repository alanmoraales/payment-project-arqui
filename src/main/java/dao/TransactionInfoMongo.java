package dao;

import transactionInfo.ITransactionInfo;

public class TransactionInfoMongo implements TransactionInfoDao{
    @Override
    public boolean save(ITransactionInfo transactionInfo) {
        return false;
    }
}
