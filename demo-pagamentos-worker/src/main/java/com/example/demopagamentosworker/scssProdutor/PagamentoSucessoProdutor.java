package com.example.demopagamentosworker.scssProdutor;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demopagamentosworker.NotificarApi;

import dto.NotificarDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class PagamentoSucessoProdutor {

    private static final Logger logger = LoggerFactory.getLogger(PagamentoSucessoProdutor.class);

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void gerarResposta(NotificarApi notificarApi) {
        try {
            logger.info("Enviando NotificarApi para a fila: {}", notificarApi);
            amqpTemplate.convertAndSend(
                    "pagamento-response-sucesso-e",
                    "pag-resp-sucs-rout-key",
                    notificarApi);
            logger.info("NotificarApi enviado com sucesso");
        } catch (Exception e) {
            logger.error("Erro ao enviar NotificarApi para a fila", e);
        }
    }

    public void gerarResposta(NotificarDto request) {
        // TODO: Implementar este método
        throw new UnsupportedOperationException("Unimplemented method 'gerarResposta'");
    }
}
