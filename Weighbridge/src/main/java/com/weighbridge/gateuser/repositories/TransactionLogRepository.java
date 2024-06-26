package com.weighbridge.gateuser.repositories;

import com.weighbridge.gateuser.entities.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for accessing transaction log data.
 */
public interface TransactionLogRepository extends JpaRepository<TransactionLog, Integer> {

    /**
     * Retrieves a transaction log entry based on the specified ticket number.
     *
     * @param ticketNo The ticket number to search for.
     * @return The transaction log entry corresponding to the provided ticket number, if found.
     */
    TransactionLog findByTicketNo(Integer ticketNo);

    /**
     * Retrieves a transaction log entry based on the specified ticket number and status code.
     *
     * @param ticketNo   The ticket number to search for.
     * @param statusCode The status code to search for.
     * @return The transaction log entry corresponding to the provided ticket number and status code, if found.
     */
    TransactionLog findByTicketNoAndStatusCode(Integer ticketNo, String statusCode);
}

