package com.balldance.baller.repository;

import com.balldance.baller.model.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StatRepo extends JpaRepository<Stat, String> {
}
