package com.musicequipmenttradingandsellingapp.dao;

import java.util.List;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;
import com.musicequipmenttradingandsellingapp.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


