package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.ReviewDTO;
import com.example.NewNow.model.entity.Review;
import com.example.NewNow.repositories.ReviewRepository;
import com.example.NewNow.services.ReviewService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public ReviewDTO createReview(ReviewDTO reviewDTO) {
        return null;
    }

    @Override
    public Set<ReviewDTO> getAllReviews() {
        Set<ReviewDTO> reviewDTOSet = new HashSet<>();
        for (Review review : reviewRepository.findAll()) {
            ReviewDTO reviewDTO = convertReviewToDTO(review);
            reviewDTOSet.add(reviewDTO);
        }
        return reviewDTOSet;
    }

    @Override
    public ReviewDTO getReviewById(Long id) {
        ReviewDTO reviewDTO = new ReviewDTO();
        Optional<Review> review = reviewRepository.findById(id);
        if (review.isPresent()) {
            reviewDTO = convertReviewToDTO(review.get());
        }
        return reviewDTO;
    }

    @Override
    public Boolean deleteReviewById(Long id) {
        return null;
    }

    @Override
    public ReviewDTO updateReviewById(Long id, ReviewDTO reviewDTO) {
        return null;
    }

    public ReviewDTO convertReviewToDTO(Review review) {
        ReviewDTO reviewDTO = new ReviewDTO();
        reviewDTO.setId(review.getId());
        reviewDTO.setCreatedAt(review.getCreatedAt());
        reviewDTO.setEventCount(review.getEventCount());
        reviewDTO.setHidden(review.getHidden());
        return reviewDTO;
    }
}
