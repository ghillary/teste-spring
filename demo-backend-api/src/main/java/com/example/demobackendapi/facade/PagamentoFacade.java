package com.example.demobackendapi.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demobackendapi.dto.PAgamentoDto;

@Service
public class PagamentoFacade {

    private static final Logger logger = LoggerFactory.getLogger(PagamentoFacade.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public String solicitarPagamento(PAgamentoDto request) {
        logger.info("Solicitação de pagamento recebida: {}", request);

        try {
            amqpTemplate.convertAndSend("pagamento-request-e", "pagamento-request-e", request);
            logger.info("Pagamento enviado para a fila");
        } catch (Exception e) {
            logger.error("Erro ao enviar pagamento para a fila", e);
            return "Erro ao processar pagamento";
        }

        // Chamar o /notificar via HTTP (ainda precisa implementar)

        return "Pagamento aguardando confirmação";
    }

    public void sucessoPagamento(String payload) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessoPagamento'");
    }
}
