package com.bharath.ws.soap;

import com.bharath.ws.soap.dto.RideProcessorRequest;
import com.bharath.ws.soap.dto.RideProcessorResponse;

public class RideProcessorImpl implements RideProcessor {

	public RideProcessorResponse processRide(RideProcessorRequest rideProcessorRequest) {
		RideProcessorResponse rideProcessorResponse = new RideProcessorResponse();
		// Business Logic or a call to a Business Logic Class Goes Here.
		rideProcessorResponse.setResult(true);
		return rideProcessorResponse;
	}

}
