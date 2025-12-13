package com.example.NewNow.services.implementations;

import com.example.NewNow.model.dto.ReviewDTO;
import com.example.NewNow.model.dto.location.ReviewCreateDTO;
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
    public ReviewDTO createReview(ReviewCreateDTO reviewDTO) {
        if (reviewDTO == null) {
            throw new IllegalArgumentException("ReviewDTO ne sme biti null.");
        }

        Review review = new Review();

        // eventCount – ako nema u DTO, krećemo od 0
        if (reviewDTO.getEventCount() != null) {
            review.setEventCount(reviewDTO.getEventCount());
        } else {
            review.setEventCount(0);
        }

        // hidden – podrazumevano false
        if (reviewDTO.getHidden() != null) {
            review.setHidden(reviewDTO.getHidden());
        } else {
            review.setHidden(false);
        }

        // createdAt najčešće ide iz baze / @CreationTimestamp, pa ga ne diramo

        Review saved = reviewRepository.save(review);
        return convertReviewToDTO(saved);
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
        if (id == null) {
            return false;
        }

        if (!reviewRepository.existsById(id)) {
            return false;
        }

        reviewRepository.deleteById(id);
        return true;
    }


    @Override
    public ReviewDTO updateReviewById(Long id, ReviewDTO reviewDTO) {
        if (id == null || reviewDTO == null) {
            return null;
        }

        Optional<Review> optionalReview = reviewRepository.findById(id);
        if (optionalReview.isEmpty()) {
            return null;
        }

        Review review = optionalReview.get();

        if (reviewDTO.getEventCount() != null) {
            review.setEventCount(reviewDTO.getEventCount());
        }
        if (reviewDTO.getHidden() != null) {
            review.setHidden(reviewDTO.getHidden());
        }

        Review saved = reviewRepository.save(review);
        return convertReviewToDTO(saved);
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
