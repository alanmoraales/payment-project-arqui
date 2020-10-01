package dao;

import transactionInfo.ITransactionInfo;

public interface TransactionInfoDao {
    boolean save(ITransactionInfo transactionInfo);
}
