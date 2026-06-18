package com.weddingplanner.calendar.repository;

import java.util.List;

import com.weddingplanner.calendar.domain.CalendarEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CalendarEventRepository extends MongoRepository<CalendarEvent, String> {

    List<CalendarEvent> findByOwnerIdOrPartnerId(String ownerId, String partnerId);
}
