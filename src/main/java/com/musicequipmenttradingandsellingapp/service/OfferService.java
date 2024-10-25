package com.musicequipmenttradingandsellingapp.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.musicequipmenttradingandsellingapp.domain.Offer;
import com.musicequipmenttradingandsellingapp.dto.OfferDTO;
import com.musicequipmenttradingandsellingapp.dto.OfferSearchDTO;
import com.musicequipmenttradingandsellingapp.dto.OfferPageDTO;
import com.musicequipmenttradingandsellingapp.dto.OfferConvertCriteriaDTO;
import com.musicequipmenttradingandsellingapp.service.GenericService;
import com.musicequipmenttradingandsellingapp.dto.common.RequestDTO;
import com.musicequipmenttradingandsellingapp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OfferService extends GenericService<Offer, Integer> {

	List<Offer> findAll();

	ResultDTO addOffer(OfferDTO offerDTO, RequestDTO requestDTO);

	ResultDTO updateOffer(OfferDTO offerDTO, RequestDTO requestDTO);

    Page<Offer> getAllOffers(Pageable pageable);

    Page<Offer> getAllOffers(Specification<Offer> spec, Pageable pageable);

	ResponseEntity<OfferPageDTO> getOffers(OfferSearchDTO offerSearchDTO);
	
	List<OfferDTO> convertOffersToOfferDTOs(List<Offer> offers, OfferConvertCriteriaDTO convertCriteria);

	OfferDTO getOfferDTOById(Integer offerId);







}





