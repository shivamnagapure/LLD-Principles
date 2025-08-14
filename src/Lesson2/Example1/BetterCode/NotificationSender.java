package Lesson2.Example1.BetterCode;

import java.util.List;

public class NotificationSender {

    //Abstraction aechived here
    // NotificationSender does not know about type of notification
    // it knows notification has send method , which have to call
    public void sendNotification(List<Notification> notifications){
//        for(Notification notification : notifications){
//            notification.send();
//        }
        notifications.forEach(Notification::send);
    }

}
