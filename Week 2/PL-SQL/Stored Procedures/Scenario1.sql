CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    -- Update the balance of all savings accounts by applying a 1% interest rate
    UPDATE accounts
    SET balance = balance * 1.01
    WHERE account_type = 'Savings';
    
    -- Commit the transaction
    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Monthly interest processed for all savings accounts.');
END ProcessMonthlyInterest;
/
