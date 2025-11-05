package com.nimbus.tx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nimbus.tx.service.BankingService;

public class MainTX {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(/* AppConfig.class */);
        BankingService service = context.getBean(BankingService.class);
        service.transfer(1, 2, 500);
        context.close();
    }
}
