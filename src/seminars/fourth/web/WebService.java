package seminars.fourth.web;

public class WebService {
    private HttpClient httpClient;

    public WebService(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public String getDataFromWebsite(String url) {
        return httpClient.get(url);
    }
}