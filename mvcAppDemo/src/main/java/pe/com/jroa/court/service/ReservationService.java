package pe.com.jroa.court.service;

import java.util.List;
import pe.com.jroa.court.domain.Reservation;

public interface ReservationService {
	public List<Reservation> query (String courtName);
}
