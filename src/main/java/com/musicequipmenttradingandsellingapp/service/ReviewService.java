package com.musicequipmenttradingandsellingapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.musicequipmenttradingandsellingapp.domain.Review;
import com.musicequipmenttradingandsellingapp.dto.ReviewDTO;
import com.musicequipmenttradingandsellingapp.dto.ReviewSearchDTO;
import com.musicequipmenttradingandsellingapp.dto.ReviewPageDTO;
import com.musicequipmenttradingandsellingapp.dto.ReviewConvertCriteriaDTO;
import com.musicequipmenttradingandsellingapp.service.GenericService;
import com.musicequipmenttradingandsellingapp.dto.common.RequestDTO;
import com.musicequipmenttradingandsellingapp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ReviewService extends GenericService<Review, Integer> {

	List<Review> findAll();

	ResultDTO addReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

	ResultDTO updateReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

    Page<Review> getAllReviews(Pageable pageable);

    Page<Review> getAllReviews(Specification<Review> spec, Pageable pageable);

	ResponseEntity<ReviewPageDTO> getReviews(ReviewSearchDTO reviewSearchDTO);
	
	List<ReviewDTO> convertReviewsToReviewDTOs(List<Review> reviews, ReviewConvertCriteriaDTO convertCriteria);

	ReviewDTO getReviewDTOById(Integer reviewId);







}





