package com.rating.service.impl;

import com.rating.entities.Rating;
import com.rating.exceptions.ResourceNotFound;
import com.rating.repositories.RatingRepository;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating saveRating(Rating rating) {
        String userId  = UUID.randomUUID().toString();
        rating.setRatingId(userId);
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public Rating getRatingById(String id) {
        return ratingRepository.findById(id).orElseThrow(()-> new ResourceNotFound("Rating not found for id on server !!"));
    }

    @Override
    public List<Rating> getRatingsByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }
}
