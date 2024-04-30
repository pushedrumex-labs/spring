package com.laboratory.spring.transactional.inner_call;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class TransactionService {

    @Autowired
    InnerTransactionService innerTransactionService;

    @Transactional
    public void outerTransaction() {
        log.info("TransactionService.outerTransaction");
    }

    @Transactional
    public void outerTransactionWithInnerTransaction() {
        log.info("TransactionService.outerTransactionWithInnerTransaction");
//        innerTransaction();
        innerTransactionService.innerTransaction();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void innerTransaction() {
        log.info("InnerTransactionService.innerTransactional");
    }

}
