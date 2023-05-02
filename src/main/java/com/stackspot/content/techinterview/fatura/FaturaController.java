package com.stackspot.content.techinterview.fatura;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fatura")
public class FaturaController {

    public FaturaRepository fatura_repository;

    double TotalFaturas = 0.0;

    @GetMapping("/{date}/{client}")
    public Fatura getFatura(@PathVariable("date") String date, @PathVariable("client") String client) {
        return fatura_repository.findByDateAndClient(date, client);
    }

    @GetMapping("/all/{client}")
    public double getAllFaturas(@PathVariable("client") String client) {
        List<Fatura> FATURAS = fatura_repository.findAllByClient(client);

        for(int i = 0; i < FATURAS.size(); i++) {
            TotalFaturas = TotalFaturas + FATURAS.get(i).getValue();
        }

        return TotalFaturas;
    }
}
