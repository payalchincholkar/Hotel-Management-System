package com.receptionistmanagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.receptionistmanagement.entity.ReservationEntity;
import com.receptionistmanagement.repository.ReservationRepo;
@Service
public class ReservationServiceImpl implements ReservationService {
 @Autowired
 private ReservationRepo reservationRepo;
	@Override
	public ReservationEntity addReservation(ReservationEntity reservationEntity) {
		
		return this.reservationRepo.save(reservationEntity);
	}

	@Override
	public List<ReservationEntity> getAllReservation() {
		
		return this.reservationRepo.findAll();
	}
}
