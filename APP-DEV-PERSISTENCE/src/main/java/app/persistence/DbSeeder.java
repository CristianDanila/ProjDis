package app.persistence;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import app.domain.Hotel;

@Component
public class DbSeeder implements CommandLineRunner{

	private HotelRepository hotelRepository;
	
	public DbSeeder(HotelRepository hotelRepository){
		
		this.hotelRepository = hotelRepository;
	}	
	// class will automaticaly executed at start up
	@Override
	public void run(String... args) throws Exception {
				
		Hotel marriot = new Hotel("Moldova", 5, true);
		Hotel ibis = new Hotel("Ibis", 4, false);
		Hotel tenerife = new Hotel("Tenerife", 5, true);
		
		List<Hotel> hotels = new ArrayList<>();
		hotels.add(marriot);
		hotels.add(ibis);
		hotels.add(tenerife);

		this.hotelRepository.saveAll(hotels);
	}

}