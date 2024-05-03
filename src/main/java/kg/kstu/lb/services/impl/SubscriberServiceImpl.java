package kg.kstu.lb.services.impl;

import kg.kstu.lb.dto.BlockSubscriberRequest;
import kg.kstu.lb.dto.SubscriberDto;
import kg.kstu.lb.enums.SubscriberStatus;
import kg.kstu.lb.mapper.SubscriberMapper;
import kg.kstu.lb.entities.Subscriber;
import kg.kstu.lb.repository.SubscriberRepository;
import kg.kstu.lb.services.SubscriberService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class SubscriberServiceImpl implements SubscriberService {

    SubscriberRepository repository;
    SubscriberMapper subscriberMapper;

    @Override
    public Subscriber create(SubscriberDto subscriberDto) {
        Subscriber subscriber = subscriberMapper.mapToSubscriber(subscriberDto);

        return repository.save(subscriber);
    }

    @Override
    public Subscriber getById(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Subscriber with id %s not fount".formatted(id)));//todo add custom exceptions and exception handler
    }

    @Override
    public Subscriber getByTaxpayerId(Long taxpayerId) {
        return repository.findByTaxpayerId(taxpayerId).orElseThrow(() -> new RuntimeException("Subscriber with taxpayerId %s not fount".formatted(taxpayerId)));
    }

    @Override
    public Subscriber blockSubscriber(BlockSubscriberRequest request) {
        Subscriber subscriber = getByTaxpayerId(request.getTaxpayerId());
        subscriber.setStatus(SubscriberStatus.BLOCKED);
        subscriber.setBlockingDate(LocalDateTime.now());
        subscriber.setBlockingDescription(request.getBlockingDescription());

        return repository.save(subscriber);
    }

    @Override
    public Subscriber unblockSubscriber(Long taxpayerId) {
        Subscriber subscriber = getByTaxpayerId(taxpayerId);
        subscriber.setStatus(SubscriberStatus.ACTIVE);
        subscriber.setBlockingDate(null);
        subscriber.setBlockingDescription(null);

        return repository.save(subscriber);
    }
}
