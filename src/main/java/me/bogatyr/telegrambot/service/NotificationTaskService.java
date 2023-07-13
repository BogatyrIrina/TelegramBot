package me.bogatyr.telegrambot.service;

import me.bogatyr.telegrambot.entity.NotificationTask;
import me.bogatyr.telegrambot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {
    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }
    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);
    }
}
