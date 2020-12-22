package com.petfeeder.petfeeder.repositoy;

import com.petfeeder.petfeeder.domain.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Long> {
}
