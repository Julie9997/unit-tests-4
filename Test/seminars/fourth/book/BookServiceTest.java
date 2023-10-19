package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    public void testFindBookById() {
        // Arrange
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepositoryMock);
        String bookId = "1";
        Book expectedBook = new Book("1", "Book1", "Author1");

        when(bookRepositoryMock.findById(bookId)).thenReturn(expectedBook);

        // Act
        Book foundBook = bookService.findBookById(bookId);

        // Assert
        assertEquals(expectedBook, foundBook);
        verify(bookRepositoryMock, times(1)).findById(bookId);
    }

    @Test
    public void testFindAllBooks() {
        // Arrange
        BookRepository bookRepositoryMock = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepositoryMock);
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book1", "Author1"));
        expectedBooks.add(new Book("2", "Book2", "Author2"));

        when(bookRepositoryMock.findAll()).thenReturn(expectedBooks);

        // Act
        List<Book> foundBooks = bookService.findAllBooks();

        // Assert
        assertEquals(expectedBooks, foundBooks);
        verify(bookRepositoryMock, times(1)).findAll();
    }

}