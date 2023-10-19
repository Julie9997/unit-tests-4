package seminars.fourth.message;


import org.junit.jupiter.api.Test;
import seminars.fourth.hotel.BookingService;
import seminars.fourth.hotel.HotelService;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class NotificationServiceTest {

    @Test
    public void TestNotificationServiceWithMock() {
        // Arrange
        MessageService messageServiceMock = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageServiceMock);
        String message = "Hello";
        String recipient = "example";

        // Act
        notificationService.sendNotification(message, recipient);
        // Assert
        verify(messageServiceMock, times(1)).sendMessage(message, recipient);
    }

}