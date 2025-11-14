package com.laboratory.spring.transactional.inner_call;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TransactionServiceTest {

    @Autowired
    TransactionService transactionService;

    @Test
    void callOuterTransaction() {
        transactionService.outerTransaction();
    }

    @Test
    void callOuterTransactionWithInnerTransaction() {
        transactionService.outerTransactionWithInnerTransaction();
    }

    @Test
    void callOuterTransactionWithSelfInject() {
        transactionService.outerTransactionWithSelfInject();
    }

}
