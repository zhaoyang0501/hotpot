package hotpot.sys.service;
import org.springframework.stereotype.Service;

import hotpot.common.service.SimpleCurdService;
import hotpot.sys.entity.Order;
@Service
public class OrderService extends SimpleCurdService<Order, Long> {
}
