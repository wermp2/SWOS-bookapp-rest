/**
 * THIS IS A CHANGE FOR THE FIRSTBRANCH (AUFGABE 4)
 * 
 * A 2nd change that fixes the issue
 * 
 * Fixes #1
 */
package ch.bfh.swos.bookapp.service;

import ch.bfh.swos.bookapp.service.dto.BookDTO;

import java.util.Collection;

public interface BookService {

    public BookDTO create(BookDTO book);

    public BookDTO read(long id);

    public Collection<BookDTO> list();

    public BookDTO update(BookDTO book);

    public void delete(BookDTO book);
}
