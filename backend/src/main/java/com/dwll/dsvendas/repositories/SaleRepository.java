package com.dwll.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwll.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
