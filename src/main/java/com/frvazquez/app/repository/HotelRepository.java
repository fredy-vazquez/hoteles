package com.frvazquez.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.frvazquez.app.domain.Hotel;

@Repository
public interface HotelRepository extends CrudRepository<Hotel, Long> {

}
