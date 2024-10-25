package com.musicequipmenttradingandsellingapp.dao;

import java.util.List;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;
import com.musicequipmenttradingandsellingapp.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


