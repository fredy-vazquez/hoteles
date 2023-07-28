package com.frvazquez.app.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.frvazquez.app.domain.Hotel;
import com.frvazquez.app.service.HotelService;

@RestController("/")
public class HotelController {

	private Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

	private HotelService service;

	public HotelController(HotelService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<?> list() {
		LOGGER.info("GET | Lista  Hoteles");
		return ResponseEntity.ok().body(service.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> show(@PathVariable Long id) {
		LOGGER.info("GET | Hotel {}", id);
		Optional<Hotel> resultado = service.findById(id);
		if (!resultado.isPresent())
			ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(resultado.get());
	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Hotel hotel) {
		LOGGER.info("POST | Hotel {}", hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(hotel));
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> show(@RequestBody Hotel hotel, @PathVariable Long id) {
		LOGGER.info("PUT | Hotel {}", id);

		Optional<Hotel> hotelDB = service.findById(id);
		if (!hotelDB.isPresent())
			ResponseEntity.notFound().build();
		Hotel upHotel = hotelDB.get();
		upHotel.setNombre(hotel.getNombre());
		upHotel.setDescripcion(hotel.getNombre());
		upHotel.setCadena(hotel.getCadena());
		upHotel.setEstado(hotel.getEstado());

		return ResponseEntity.ok().body(service.save(upHotel));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		LOGGER.info("DELETE | Hotel {}", id);
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
