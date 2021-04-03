package com.tpc.server.repos;

import com.tpc.server.models.tradehistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface tradehistoryRepo extends JpaRepository<tradehistory, String> {

    List<tradehistory> findAllByAccount(String account);
}
