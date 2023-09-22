package com.balldance.baller.repository;

import com.balldance.baller.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
//    @Query("SELECT * FROM USER WHERE m_uuid=?1 AND m_passwd=?2 limit 0,1")
//    User findByIdAndPasswd(String uuid, String passwd);
}
