package com.rating.service;

import com.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {

    //create user
    Rating saveRating(Rating rating);

    //get all users
    List<Rating> getRatings();

    //get user by id
    Rating getRatingById(String id);

    List<Rating> getRatingsByUserId(String userId);
}
