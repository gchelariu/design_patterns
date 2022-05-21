package design.patterns.factory;

import design.patterns.factory.notifications.Notification;

public class FactoryMain {
    public static void main(String[] args) {
        Notification notification1 = NotificationFactory.buildNotification(ENotificationType.EMAIL);
        Notification notification2 = NotificationFactory.buildNotification(ENotificationType.SMS);
        System.out.println(notification1.getClass());
        System.out.println(notification2.getClass());
    }
}
