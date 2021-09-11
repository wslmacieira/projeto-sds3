package com.dwll.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dwll.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
