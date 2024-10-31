/**
 * @author Starling Diaz on 10/31/2024.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version book-management 1.0
 * @since 10/31/2024.
 */

package com.starlingdiaz.bookmanagement.service;

import com.starlingdiaz.bookmanagement.dto.BookDTO;

import java.util.List;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO updateBook(Long id, BookDTO bookDTO);
    void deleteBook(Long id);
    BookDTO getBookById(Long id);
    List<BookDTO> getAllBooks();
}