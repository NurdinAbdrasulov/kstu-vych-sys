package kg.kstu.lb.dto;

import kg.kstu.lb.enums.ServiceType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateSubscriberRequest {

    @NotEmpty
    String tin;

    @NotNull
    LocalDateTime registrationDate;

    @NotNull
    Long taxpayerId;

    @NotNull
    List<ServiceType> serviceTypes;
}
