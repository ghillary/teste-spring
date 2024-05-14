package com.example.demopagamentosworker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demopagamentosworker.scssProdutor.PagamentoSucessoProdutor;

import dto.NotificarDto;

@RestController
@RequestMapping(value = "/notificar", method = RequestMethod.POST)
@ResponseBody

public class NotificarApi {

    @Autowired
    private PagamentoSucessoProdutor pagamentoSucessoProdutor;


     @PostMapping
     public void processar(@RequestBody NotificarDto request) {
     pagamentoSucessoProdutor.gerarResposta(request);
     }

}
