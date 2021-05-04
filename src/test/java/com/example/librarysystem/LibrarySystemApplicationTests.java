package com.example.librarysystem;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.example.librarysystem.repository.BookRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ActiveProfiles;

import com.example.librarysystem.model.Book;

import java.util.List;

@ActiveProfiles("test")
@SpringBootTest
class LibrarySystemApplicationTests {

    private Book test;
	@Test
	void contextLoads() {
	}
	@PersistenceContext
	EntityManager em;


    @Test
    @Transactional
    public void SaveBook() {
        Book book = new Book();
        em.persist(book);
    }

    @Test
    @Transactional
    public void When_SaveBook_BookIsSaved() {
        Book book = new Book();
        String title = "book's title";
        book.setTitle(title);
        em.persist(book);

        // add code to read book and check it is there

        em.persist(title);
        //boolean same = em.persist();
        //assertThat(same).isTrue();

//        List<Book> resultList = this.provider.em()
//                .createQuery("SELECT c FROM Library c", Library.class)
//                .getResultList();


        fail();
    }
}