package seminars.fourth.hotel;


import org.junit.jupiter.api.Test;
import seminars.fourth.weather.WeatherReporter;
import seminars.fourth.weather.WeatherService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class BookingServiceTest {

    @Test
    public void TestHotelServiceWithMock() {
        // Arrange
        HotelService hotelServiceMock = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelServiceMock);
        when(hotelServiceMock.isRoomAvailable(7)).thenReturn(false);

        // Act

        // Assert
        assertFalse(bookingService.bookRoom(7));

        verify(hotelServiceMock, times(1)).isRoomAvailable(7);
    }
}