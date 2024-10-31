/**
 * @author Starling Diaz on 10/31/2024.
 * @Github https://github.com/NSTLRD
 * @Website https://mentorly.blog/
 * @Academy https://www.mentor-ly.com/
 * @version book-management 1.0
 * @since 10/31/2024.
 */

package com.starlingdiaz.bookmanagement.repository;

import com.starlingdiaz.bookmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
