package com.musicequipmenttradingandsellingapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.musicequipmenttradingandsellingapp.domain.Item;
import com.musicequipmenttradingandsellingapp.dto.ItemDTO;
import com.musicequipmenttradingandsellingapp.dto.ItemSearchDTO;
import com.musicequipmenttradingandsellingapp.dto.ItemPageDTO;
import com.musicequipmenttradingandsellingapp.dto.ItemConvertCriteriaDTO;
import com.musicequipmenttradingandsellingapp.service.GenericService;
import com.musicequipmenttradingandsellingapp.dto.common.RequestDTO;
import com.musicequipmenttradingandsellingapp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ItemService extends GenericService<Item, Integer> {

	List<Item> findAll();

	ResultDTO addItem(ItemDTO itemDTO, RequestDTO requestDTO);

	ResultDTO updateItem(ItemDTO itemDTO, RequestDTO requestDTO);

    Page<Item> getAllItems(Pageable pageable);

    Page<Item> getAllItems(Specification<Item> spec, Pageable pageable);

	ResponseEntity<ItemPageDTO> getItems(ItemSearchDTO itemSearchDTO);
	
	List<ItemDTO> convertItemsToItemDTOs(List<Item> items, ItemConvertCriteriaDTO convertCriteria);

	ItemDTO getItemDTOById(Integer itemId);







}





