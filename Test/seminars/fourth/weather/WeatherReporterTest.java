package seminars.fourth.weather;


import org.junit.jupiter.api.Test;
import seminars.fourth.card.CreditCard;
import seminars.fourth.card.PaymentForm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class WeatherReporterTest {

    @Test
    public void TestWeatherReporterWithMock() {
        // Arrange
        WeatherService weatherServiceMock = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(weatherServiceMock);
        when(weatherServiceMock.getCurrentTemperature()).thenReturn(24);

        // Act
        String res = weatherReporter.generateReport();
        // Assert
        assertEquals("Текущая температура: 24 градусов.", res);

        verify(weatherServiceMock, times(1)).getCurrentTemperature();
    }

}