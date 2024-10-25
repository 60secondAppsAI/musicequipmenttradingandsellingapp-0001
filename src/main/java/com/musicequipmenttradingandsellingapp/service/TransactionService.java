package com.musicequipmenttradingandsellingapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.musicequipmenttradingandsellingapp.domain.Transaction;
import com.musicequipmenttradingandsellingapp.dto.TransactionDTO;
import com.musicequipmenttradingandsellingapp.dto.TransactionSearchDTO;
import com.musicequipmenttradingandsellingapp.dto.TransactionPageDTO;
import com.musicequipmenttradingandsellingapp.dto.TransactionConvertCriteriaDTO;
import com.musicequipmenttradingandsellingapp.service.GenericService;
import com.musicequipmenttradingandsellingapp.dto.common.RequestDTO;
import com.musicequipmenttradingandsellingapp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface TransactionService extends GenericService<Transaction, Integer> {

	List<Transaction> findAll();

	ResultDTO addTransaction(TransactionDTO transactionDTO, RequestDTO requestDTO);

	ResultDTO updateTransaction(TransactionDTO transactionDTO, RequestDTO requestDTO);

    Page<Transaction> getAllTransactions(Pageable pageable);

    Page<Transaction> getAllTransactions(Specification<Transaction> spec, Pageable pageable);

	ResponseEntity<TransactionPageDTO> getTransactions(TransactionSearchDTO transactionSearchDTO);
	
	List<TransactionDTO> convertTransactionsToTransactionDTOs(List<Transaction> transactions, TransactionConvertCriteriaDTO convertCriteria);

	TransactionDTO getTransactionDTOById(Integer transactionId);







}





