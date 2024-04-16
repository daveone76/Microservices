package com.daveone.MSshopping.repository;

import com.daveone.MSshopping.entity.InvoiceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem, Long> {
}
