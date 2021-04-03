package com.tpc.server.repos;

import com.tpc.server.models.dayprofit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface dayprofitRepo extends JpaRepository<dayprofit, Integer> {

    List<dayprofit> findAllByAccount(String account);
}
