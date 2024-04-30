package com.laboratory.spring.transactional.inner_call;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
public class InnerTransactionService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void innerTransaction() {
        log.info("InnerTransactionService.innerTransactional");
    }

}
