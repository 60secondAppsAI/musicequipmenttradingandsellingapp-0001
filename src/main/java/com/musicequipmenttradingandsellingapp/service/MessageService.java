package com.musicequipmenttradingandsellingapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.musicequipmenttradingandsellingapp.domain.Message;
import com.musicequipmenttradingandsellingapp.dto.MessageDTO;
import com.musicequipmenttradingandsellingapp.dto.MessageSearchDTO;
import com.musicequipmenttradingandsellingapp.dto.MessagePageDTO;
import com.musicequipmenttradingandsellingapp.dto.MessageConvertCriteriaDTO;
import com.musicequipmenttradingandsellingapp.service.GenericService;
import com.musicequipmenttradingandsellingapp.dto.common.RequestDTO;
import com.musicequipmenttradingandsellingapp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface MessageService extends GenericService<Message, Integer> {

	List<Message> findAll();

	ResultDTO addMessage(MessageDTO messageDTO, RequestDTO requestDTO);

	ResultDTO updateMessage(MessageDTO messageDTO, RequestDTO requestDTO);

    Page<Message> getAllMessages(Pageable pageable);

    Page<Message> getAllMessages(Specification<Message> spec, Pageable pageable);

	ResponseEntity<MessagePageDTO> getMessages(MessageSearchDTO messageSearchDTO);
	
	List<MessageDTO> convertMessagesToMessageDTOs(List<Message> messages, MessageConvertCriteriaDTO convertCriteria);

	MessageDTO getMessageDTOById(Integer messageId);







}





