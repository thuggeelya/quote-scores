package ru.thuggeelya.quotescores.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.thuggeelya.quotescores.dto.Quote;

import java.util.List;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
    List<Quote> findByOrderByVotesCountDesc(Pageable pageable);

    @Override
    long count();
}