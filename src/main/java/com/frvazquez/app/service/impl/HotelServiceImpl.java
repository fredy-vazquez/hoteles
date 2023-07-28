package com.frvazquez.app.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.frvazquez.app.domain.Hotel;
import com.frvazquez.app.repository.HotelRepository;
import com.frvazquez.app.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	private HotelRepository repository;
	
	public HotelServiceImpl(HotelRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Iterable<Hotel> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Hotel> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Hotel save(Hotel hotel) {
		return repository.save(hotel);
	}

	@Override
	public void delete(Long id) {
		Optional<Hotel> hotel = repository.findById(id);
		if(hotel.isPresent())
			repository.delete(hotel.get());

	}

}
