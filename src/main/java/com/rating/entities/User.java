package com.rating.entities;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private String userId;
    private String name;
    private String email;
    private String about;
    private List<Rating> ratings = new ArrayList<>();
}
