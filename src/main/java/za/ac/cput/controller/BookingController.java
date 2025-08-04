package za.ac.cput.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Booking;
import za.ac.cput.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private BookingService service;


    @Autowired
    public BookingController(BookingService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Booking create(@RequestBody Booking booking) {
        return service.create(booking);
    }

    @GetMapping("/read/{bookingId}")
    public Booking read(@PathVariable Long bookingId) {
        return service.read(bookingId);
    }

    @PutMapping("/update")
    public Booking update(@RequestBody Booking booking) {
        return service.update(booking);
    }

    @DeleteMapping("/delete/{bookingId}")
    public boolean delete(@PathVariable Long bookingId) {
        return service.delete(bookingId);
    }

    @GetMapping("/getAll")
    public List<Booking> getAll() {
        return service.getAll();
    }
}

