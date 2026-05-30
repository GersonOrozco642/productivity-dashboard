package com.gerzon.productivity_dashboard.repository;

import com.gerzon.productivity_dashboard.model.Streak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreakRepository extends JpaRepository<Streak, Long> {
}