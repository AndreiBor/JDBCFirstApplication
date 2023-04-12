package by.itacademy.jdbc.starter.dto;

import lombok.*;

@Value
public class TicketDto {
    private Long id;
    private Long flightId;
    private String seatNo;
}
