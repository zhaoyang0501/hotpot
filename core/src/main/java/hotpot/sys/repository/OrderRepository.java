package hotpot.sys.repository;
import hotpot.common.repository.SimpleCurdRepository;
import hotpot.sys.entity.FrontUser;
import hotpot.sys.entity.Order;

import java.util.List;
public interface OrderRepository   extends SimpleCurdRepository<Order ,Long>{
	public List<Order> findByFrontUser(FrontUser user);
}