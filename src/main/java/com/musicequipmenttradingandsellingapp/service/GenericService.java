package com.musicequipmenttradingandsellingapp.service;

import com.musicequipmenttradingandsellingapp.dao.GenericDAO;

public interface GenericService<T, ID> {

    abstract GenericDAO<T, ID> getDAO();

    T getById(Integer id) ;

}