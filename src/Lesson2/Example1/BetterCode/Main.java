package Lesson2.Example1.BetterCode;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        WhatsappNotification whatsappNotification = new WhatsappNotification();

        List<Notification> notifications = List.of(emailNotification , whatsappNotification);

        NotificationSender sender = new NotificationSender();
        sender.sendNotification(notifications);
    }
}
