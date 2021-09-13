package br.com.zupacademy.yudi.transacao.config.kafka;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.math.BigDecimal;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;

@JsonAutoDetect(fieldVisibility = ANY)
public class TransactionEvent {

    private String id;
    private BigDecimal valor;

    @Override
    public String toString() {
        return "TransactionEvent{" +
                "id='" + id + '\'' +
                ", value=" + valor +
                '}';
    }
}
