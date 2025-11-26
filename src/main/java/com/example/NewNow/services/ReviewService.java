package com.example.NewNow.services;

import com.example.NewNow.model.dto.ReviewDTO;

import java.util.Set;

public interface ReviewService {
    ReviewDTO createReview(ReviewDTO reviewDTO);
    Set<ReviewDTO> getAllReviews();
    ReviewDTO getReviewById(Long id);
    Boolean deleteReviewById(Long id);
    ReviewDTO updateReviewById(Long id, ReviewDTO reviewDTO);

}
