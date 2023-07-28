package com.frvazquez.app.service;

import java.util.Optional;

import com.frvazquez.app.domain.Hotel;

public interface HotelService {

	public Iterable<Hotel> findAll();

	public Optional<Hotel> findById(Long id);

	public Hotel save(Hotel hotel);

	public void delete(Long id);

}
