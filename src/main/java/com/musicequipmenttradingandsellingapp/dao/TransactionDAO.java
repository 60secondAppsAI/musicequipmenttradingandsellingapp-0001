package com.musicequipmenttradingandsellingapp.dao;

import java.util.List;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;
import com.musicequipmenttradingandsellingapp.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}


