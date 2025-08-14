package Lesson2.Example1.ProblematicCode;

import java.util.List;

//Not Extensible

//if we add new notification type then we have to change code in NotificationSender
//  knows too much about enum NotificationType , its type and methods

public class NotificationSender {
    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();;
            } else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}
