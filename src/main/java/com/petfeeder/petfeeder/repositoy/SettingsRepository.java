package com.petfeeder.petfeeder.repositoy;

import com.petfeeder.petfeeder.domain.Setting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingsRepository extends JpaRepository<Setting, Long> {
}
