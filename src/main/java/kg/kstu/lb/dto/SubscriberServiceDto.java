package kg.kstu.lb.dto;

import kg.kstu.lb.enums.SubscriberServicesStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubscriberServiceDto {
    Long id;
    Long subscriberId;
    Long serviceId;
    SubscriberServicesStatus status;
    LocalDateTime enableDate;
    LocalDateTime disableDate;
    LocalDate nextRecurringChargeDate;
}
