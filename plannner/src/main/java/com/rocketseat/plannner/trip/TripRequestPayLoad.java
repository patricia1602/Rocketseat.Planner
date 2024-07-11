package com.rocketseat.plannner.trip;

import java.util.List;

public record TripRequestPayLoad(String destination, String stars_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name) {

}
