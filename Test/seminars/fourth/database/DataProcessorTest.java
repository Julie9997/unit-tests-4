package seminars.fourth.database;


import org.junit.jupiter.api.Test;
import seminars.fourth.hotel.BookingService;
import seminars.fourth.hotel.HotelService;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class DataProcessorTest {

    @Test
    public void TestDataProcessorWithMock() {
        // Arrange
        Database databaseMock = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(databaseMock);
        String sql = "SELECT * FROM table";
        List<String> expectedResult = Arrays.asList("Data1", "Data2", "Data3");

        when(databaseMock.query(sql)).thenReturn(expectedResult);

        // Act
        List<String> result = dataProcessor.processData(sql);

        // Assert
        assertEquals(expectedResult, result);
        verify(databaseMock, times(1)).query(sql);
    }
}