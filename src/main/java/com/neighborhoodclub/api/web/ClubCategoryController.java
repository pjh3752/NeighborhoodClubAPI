package com.neighborhoodclub.api.web;

import com.neighborhoodclub.api.domain.clubCategories.ClubCategory;
import com.neighborhoodclub.api.domain.clubCategories.ClubCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/v1")
@RestController
public class ClubCategoryController {

    private final ClubCategoryRepository clubCategoryRepository;

    @GetMapping("/clubCategories")
    public List<ClubCategory> findByClubCategoryUse() {
        return clubCategoryRepository.findByClubCategoryUse("Y");
    }

}
