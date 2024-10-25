package com.musicequipmenttradingandsellingapp.dao;

import java.util.List;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;
import com.musicequipmenttradingandsellingapp.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


