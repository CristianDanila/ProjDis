package app.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.domain.Hotel;
import app.persistence.HotelRepository;

@RestController
public class HotelController {

	private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@GetMapping("/hotels")
	public List<Hotel> getHotels() {

		List<Hotel> hotels = this.hotelRepository.findAll();

		return hotels;
	}

}
