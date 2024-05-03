package kg.kstu.lb.services;

import kg.kstu.lb.dto.BlockSubscriberRequest;
import kg.kstu.lb.dto.SubscriberDto;
import kg.kstu.lb.entities.Subscriber;

public interface SubscriberService {
    Subscriber create(SubscriberDto subscriberDto);

    Subscriber getById(Long id);

    Subscriber getByTaxpayerId(Long taxpayerId);

    Subscriber blockSubscriber(BlockSubscriberRequest request);

    Subscriber unblockSubscriber(Long taxpayerId);
}
