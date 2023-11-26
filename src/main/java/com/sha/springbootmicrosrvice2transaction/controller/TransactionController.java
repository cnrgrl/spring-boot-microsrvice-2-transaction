package com.sha.springbootmicrosrvice2transaction.controller;

import com.sha.springbootmicrosrvice2transaction.model.Transaction;
import com.sha.springbootmicrosrvice2transaction.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/transaction")
public class TransactionController {
    @Autowired
    private ITransactionService transactionService;

    @PostMapping
    public ResponseEntity<?> saveTransaction(@RequestBody Transaction transaction) {
        return new ResponseEntity<>(transactionService.saveTransaction(transaction), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{transactionId}")
    public ResponseEntity<?> deleteTransaction(@PathVariable Long transactionId) {
        transactionService.deleteTransaction(transactionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(path = "/{userId}")
    public ResponseEntity<?> getAllTransactionOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(transactionService.findAllTransactionOfUser(userId));
    }
}
