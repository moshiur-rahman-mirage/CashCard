package com.cashcard;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

interface CashCardRepository extends PagingAndSortingRepository<CashCard, Long>,CrudRepository<CashCard,Long> {
}
