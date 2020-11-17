package mmaend.Simplefb.repo;

import mmaend.Simplefb.domain.User;
import mmaend.Simplefb.domain.UserSubscription;
import mmaend.Simplefb.domain.UserSubscriptionId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserSubscriptionRepo extends JpaRepository<UserSubscription, UserSubscriptionId> {
    List<UserSubscription> findBySubscriber(User user);
}