package br.com.zupacademy.yudi.transacao.config.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionListener {

    @KafkaListener(topics = "transacoes")
    public void listen(TransactionEvent transactionEvent) {
        System.out.println(transactionEvent.toString());
    }
}
