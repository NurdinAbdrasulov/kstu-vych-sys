package kg.kstu.lb.dto;

import kg.kstu.lb.enums.CashRegisterStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CashRegisterDto {
    Long id;
    SubscriberDto subscriberDto;
    String rnm;
    CashRegisterStatus status;
    LocalDateTime registrationDate;
    LocalDateTime cancellationDate;
    LocalDateTime blockingDate;
    LocalDateTime suspendDate;
}


