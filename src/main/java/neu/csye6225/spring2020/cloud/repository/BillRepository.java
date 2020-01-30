package neu.csye6225.spring2020.cloud.repository;

import neu.csye6225.spring2020.cloud.model.Bill;
import neu.csye6225.spring2020.cloud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BillRepository extends JpaRepository<Bill, UUID> {

    Bill getAllBillsForUser(User user);

}
