package com.lcwd.rating.service;

import com.lcwd.rating.entities.Rating;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  RatingService {
    //Create
    Rating create(Rating rating);
    //Get all rating
    List<Rating> getRatings();
    List<Rating> getRatingByUserId(String UserId);
    List<Rating> getRatingByHotelId(String hotelId);
}
