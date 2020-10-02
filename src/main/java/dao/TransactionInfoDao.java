package dao;

import transactionInfo.ITransactionInfo;

public interface TransactionInfoDao {
    /**
     *
     * @return true is transaction was successful
     */
    boolean save(ITransactionInfo transactionInfo);
}
