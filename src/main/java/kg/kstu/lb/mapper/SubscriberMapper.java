package kg.kstu.lb.mapper;

import kg.kstu.lb.dto.CreateSubscriberRequest;
import kg.kstu.lb.dto.SubscriberDto;
import kg.kstu.lb.entities.Subscriber;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubscriberMapper {


    Subscriber mapToSubscriber(SubscriberDto request);

    SubscriberDto mapToSubscriberDto(Subscriber subscriber);

    @Mapping(target = "balance", constant = "0")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "activationDate", source = "registrationDate")
    @Mapping(target = "personalAccount", expression = "java(java.util.UUID.randomUUID().toString().substring(0, 15))")
    SubscriberDto mapToSubscriberDto(CreateSubscriberRequest createSubscriberRequest);
}
