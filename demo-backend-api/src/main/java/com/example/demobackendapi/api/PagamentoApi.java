package com.example.demobackendapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demobackendapi.dto.PAgamentoDto;
import com.example.demobackendapi.facade.PagamentoFacade;

@RestController
@RequestMapping(value = "/pagar", method = RequestMethod.POST)
public class PagamentoApi {
    @Autowired
    private PagamentoFacade pagamentoFacade;

    @PostMapping
    public String processar(@RequestBody PAgamentoDto request) {
        return pagamentoFacade.solicitarPagamento(request);
    }

}
