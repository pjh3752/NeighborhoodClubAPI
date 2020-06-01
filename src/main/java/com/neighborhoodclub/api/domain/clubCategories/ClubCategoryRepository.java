package com.neighborhoodclub.api.domain.clubCategories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubCategoryRepository extends JpaRepository<ClubCategory, Long> {

    List<ClubCategory> findByClubCategoryUse(String clubCategoryUse);
}
