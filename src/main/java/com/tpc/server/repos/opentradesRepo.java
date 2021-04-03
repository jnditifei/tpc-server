package com.tpc.server.repos;

import com.tpc.server.models.opentrades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface opentradesRepo extends JpaRepository<opentrades, String> {
}
