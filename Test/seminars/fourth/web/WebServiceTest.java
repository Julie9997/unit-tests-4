package seminars.fourth.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class WebServiceTest {

    @Test
    public void testGetDataFromWebsite() {
        // Arrange
        HttpClient httpClientMock = mock(HttpClient.class);
        WebService webService = new WebService(httpClientMock);
        String url = "http://example.com";
        String expectedResponse = "Response from website";

        when(httpClientMock.get(url)).thenReturn(expectedResponse);

        // Act
        String response = webService.getDataFromWebsite(url);

        // Assert
        assertEquals(expectedResponse, response);
        verify(httpClientMock, times(1)).get(url);
    }
}
