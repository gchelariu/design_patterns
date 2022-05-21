package design.patterns.factory;

import design.patterns.factory.notifications.EmailNotification;
import design.patterns.factory.notifications.Notification;
import design.patterns.factory.notifications.SmsNotification;

public class NotificationFactory {

    static Notification buildNotification(final ENotificationType type) {
        return switch (type) {
            case SMS -> new SmsNotification();
            case EMAIL -> new EmailNotification();
        };
    }
}
