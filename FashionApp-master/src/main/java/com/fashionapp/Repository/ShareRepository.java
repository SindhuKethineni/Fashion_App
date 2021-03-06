package com.fashionapp.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.fashionapp.Entity.Share;

public interface ShareRepository extends CrudRepository<Share, Long>{

	//@Query("select count(s) from Share s where s.userId=:userId")
		List<Share> findByUserId(long userId);

}
