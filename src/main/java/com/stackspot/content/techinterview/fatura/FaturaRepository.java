package com.stackspot.content.techinterview.fatura;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FaturaRepository extends JpaRepository<Fatura, Long> {

    Fatura findByDateAndClient(String date, String client);

    List<Fatura> findAllByClient(String client);
}

