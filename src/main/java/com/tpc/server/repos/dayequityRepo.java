package com.tpc.server.repos;

import com.tpc.server.models.dayequity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface dayequityRepo extends JpaRepository<dayequity, Integer> {
}
