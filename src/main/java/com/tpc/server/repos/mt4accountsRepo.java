package com.tpc.server.repos;

import com.tpc.server.models.mt4accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mt4accountsRepo extends JpaRepository<mt4accounts, Integer> {

    mt4accounts findByAccount(String account);
}
