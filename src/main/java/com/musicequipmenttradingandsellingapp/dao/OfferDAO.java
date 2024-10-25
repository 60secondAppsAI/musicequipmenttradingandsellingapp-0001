package com.musicequipmenttradingandsellingapp.dao;

import java.util.List;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;
import com.musicequipmenttradingandsellingapp.domain.Offer;





public interface OfferDAO extends GenericDAO<Offer, Integer> {
  
	List<Offer> findAll();
	






}


