package Lesson2.Example1.BetterCode;

import java.util.List;

public class NotificationSender {

    public void sendNotification(List<Notification> notifications){
        notifications.forEach(Notification::send);
    }

}
