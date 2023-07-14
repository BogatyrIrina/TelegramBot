package me.bogatyr.telegrambot.repository;

import me.bogatyr.telegrambot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {
    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
    List<NotificationTask> findAllByNotificationDateTimeAndChatId(LocalDateTime localDateTime,
                                                                  long chatID);
    @Modifying
    @Query("DELETE FROM NotificationTask WHERE message like %:nameLike%")
    void removeAllLike(@Param("nameLike") String nameLike);
}
