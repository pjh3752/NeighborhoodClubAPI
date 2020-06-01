package com.neighborhoodclub.api.domain.clubCategories;

import com.neighborhoodclub.api.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class ClubCategory extends BaseTimeEntity {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 사용
    private Long id;

    @Column(nullable = false)
    private String clubCategoryName;

    private String clubCategoryEnName;

    @Column(nullable = false)
    private String clubCategoryUse;

    @Column
    private String clubCategoryImgUrl;

    @Builder
    public ClubCategory(String clubCategoryName, String clubCategoryEnName, String clubCategoryUse, String clubCategoryImgUrl) {
        this.clubCategoryName = clubCategoryName;
        this.clubCategoryEnName = clubCategoryEnName;
        this.clubCategoryUse = clubCategoryUse;
        this.clubCategoryImgUrl = clubCategoryImgUrl;
    }
}
