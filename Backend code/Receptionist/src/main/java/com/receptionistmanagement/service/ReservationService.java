package com.receptionistmanagement.service;

import java.util.List;

import com.receptionistmanagement.entity.ReservationEntity;

public interface ReservationService {
public ReservationEntity addReservation(ReservationEntity reservationEntity);
public List<ReservationEntity> getAllReservation();
}
