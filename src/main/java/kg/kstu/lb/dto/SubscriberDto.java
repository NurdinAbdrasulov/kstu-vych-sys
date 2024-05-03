package kg.kstu.lb.dto;

import kg.kstu.lb.enums.SubscriberStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubscriberDto {
    Integer id;
    LocalDateTime createDate;
    LocalDateTime updateDate;
    String tin;
    BigDecimal balance;
    SubscriberStatus status;
    LocalDateTime activationDate;
    String personalAccount;
    String blockingDescription;
    Long taxpayerId;
}
