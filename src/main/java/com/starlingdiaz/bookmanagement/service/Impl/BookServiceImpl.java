/**
 * @author Starling Diaz on 10/31/2024.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version book-management 1.0
 * @since 10/31/2024.
 */

package com.starlingdiaz.bookmanagement.service.Impl;

import com.starlingdiaz.bookmanagement.dto.BookDTO;
import com.starlingdiaz.bookmanagement.entity.Book;
import com.starlingdiaz.bookmanagement.mapper.BookMapper;
import com.starlingdiaz.bookmanagement.repository.BookRepository;
import com.starlingdiaz.bookmanagement.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = bookMapper.toEntity(bookDTO);
        Book savedBook = bookRepository.save(book);
        return bookMapper.toDTO(savedBook);
    }

    @Override
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        existingBook.setTitle(bookDTO.getTitle());
        existingBook.setAuthor(bookDTO.getAuthor());
        existingBook.setGenre(bookDTO.getGenre());
        existingBook.setPrice(bookDTO.getPrice());
        existingBook.setPublicationYear(bookDTO.getPublicationYear());
        return bookMapper.toDTO(bookRepository.save(existingBook));
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        return bookMapper.toDTO(book);
    }

    @Override
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());
    }
}
